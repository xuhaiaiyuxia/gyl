package cn.project.gyl.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import cn.project.gyl.pojo.Role;
import cn.project.gyl.pojo.User;
import cn.project.gyl.repository.RoleRepository;
import cn.project.gyl.repository.UserRepository;
import cn.project.gyl.service.RoleService;

@Service
@Transactional
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public Iterable<Role> getAllRole() {
		return roleRepository.findAll();
	}

	@Override
	public Role getRoleByName(String name) {
		Role role = this.roleRepository.findByName(name);
		return role;
	}

	@Override
	public Role save(Role role) {
		this.roleRepository.save(role);
		return role;
	}

	@Override
	public void deleteById(Long rid) {
		this.roleRepository.delete(rid);
	}

	@Override
	public void update(Long rid, String name) {
		Role role = this.roleRepository.findOne(rid);
		role.setName(name);
		this.roleRepository.save(role);
		
	}

	@Override
	public Iterable<Role> getRoleByUid(Long uid) {
		Iterable<Role> role_all = this.roleRepository.findAll();
		List<Role> role_have = this.roleRepository.getRoleByUid(uid);
		for (Role role_h : role_have) {
			for (Role role_a : role_all) {
				if(role_a.getRid()==role_h.getRid()){
					role_a.setChecked(true);
				}
			}
		}
		return role_all;
	}

	@Override
	public void saveRole(Long uid, String checkedStr) {
		if(!StringUtils.isEmpty(checkedStr)){
			User user = userRepository.findOne(uid);
			Set<Role>roles = new HashSet<Role>();
			String[] role_ids = checkedStr.split(",");
			for (String role_id : role_ids) {
				Role role = new Role();
				role.setRid(Long.parseLong(role_id));
				roles.add(role);
			}
			user.setRoles(roles);
			this.userRepository.save(user);
		}
	}

	

}
