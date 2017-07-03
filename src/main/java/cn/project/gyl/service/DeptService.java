package cn.project.gyl.service;

import org.springframework.data.domain.Page;

import cn.project.gyl.pojo.Department;

public interface DeptService {

	Page<Department>getDeptList(Integer page,Integer size);

	Department findDeptInfoById(Long id);

	void update(Department department);

	Iterable<Department> getAll();
}
