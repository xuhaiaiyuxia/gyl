package cn.project.gyl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.project.gyl.pojo.Menuitem;
import cn.project.gyl.pojo.Privilege;
import cn.project.gyl.repository.MenuitemRepository;
import cn.project.gyl.repository.PrivilegeRepository;
import cn.project.gyl.service.MenuitemService;

@Service
@Transactional
public class MenuitemServiceImpl implements MenuitemService {

	@Autowired
	private MenuitemRepository menuitemRepository;
	
	@Autowired
	private PrivilegeRepository privilegeRepository;
	
	@Value("${system.admin.id}")
	private Long adminId;

	@Override
	public List<Menuitem> getListByPid(Long pid) {
		pid = pid == null ? 0L : pid;
		List<Menuitem> list = menuitemRepository.findByPid(pid);
		return list;
	}

	@Override
	public Iterable<Menuitem> getAll() {
		return menuitemRepository.findAll();
	}

	@Override
	public Iterable<Privilege> getMenuItemByUid(Long uid) {
		if(uid==adminId){
			Iterable<Privilege> menuItem = privilegeRepository.getAdminMenuItem();
			return menuItem;
		}
		Iterable<Privilege> result= privilegeRepository.getMenuItemByUid(uid);
		return result;
	}

}
