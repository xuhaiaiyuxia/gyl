package cn.project.gyl.service.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import cn.project.gyl.pojo.Privilege;
import cn.project.gyl.pojo.Role;
import cn.project.gyl.repository.PrivilegeRepository;
import cn.project.gyl.repository.RoleRepository;
import cn.project.gyl.service.PrivilegeService;

@Service
@Transactional
public class PrivilegeServiceImpl implements PrivilegeService{
	
	@Autowired
	private PrivilegeRepository privilegeRepository;
	
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public Iterable<Privilege> getAll() {
		
		return privilegeRepository.findAll();
	}

	@Override
	public Iterable<Privilege> getAll(Long rid) {
		Iterable<Privilege> privilege_all = privilegeRepository.findAll();
		List<Privilege>privilege_have = privilegeRepository.findPrivilegeByRoleId(rid);
		for (Privilege privilege_h : privilege_have) {
			for (Privilege privilege_a : privilege_all) {
				if(privilege_a.getId()==privilege_h.getId()){
					privilege_a.setChecked(true);
				}
			}
		}
		return privilege_all;
	}

	@Override
	public void allocateRolePrivilege(Long rid, String checkedStr) {
		Set<Privilege>privileges;
		Role role = roleRepository.findOne(rid);
		if(!StringUtils.isEmpty(checkedStr)){
			String[] privilege_ids = checkedStr.split(",");
			privileges = new HashSet<Privilege>();
			for (String pid : privilege_ids) {
				Privilege privilege = new Privilege();
				privilege.setId(Long.parseLong(pid));
				privileges.add(privilege);
			}
			role.setPrivileges(privileges);
		}else{
			role.setPrivileges(null);
		}
		this.roleRepository.save(role);
		
	}

}
