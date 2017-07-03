package cn.project.gyl.service;

import cn.project.gyl.pojo.Privilege;

public interface PrivilegeService {

	Iterable<Privilege> getAll();

	Iterable<Privilege> getAll(Long rid);

	void allocateRolePrivilege(Long rid, String checkedStr);

}
