package cn.project.gyl.service;

import cn.project.gyl.pojo.Role;

public interface RoleService {

	Iterable<Role>getAllRole();

	Role getRoleByName(String name);

	Role save(Role role);

	void deleteById(Long rid);

	void update(Long rid, String name);

	Iterable<Role> getRoleByUid(Long uid);

	void saveRole(Long uid, String checkedStr);


}
