package cn.project.gyl.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.project.gyl.pojo.Department;
import cn.project.gyl.repository.DepartmentRepository;
import cn.project.gyl.service.DeptService;

@Service
@Transactional
public class DeptServiceImpl implements DeptService{
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Page<Department> getDeptList(Integer page, Integer size) {
		Page<Department> result = departmentRepository.findAll(new PageRequest(page-1==-1?0:page-1, size));
		return result;
	}

	@Override
	public Department findDeptInfoById(Long id) {
		Department department = this.departmentRepository.findOne(id);
		return department;
	}

	@Override
	public void update(Department department) {
		this.departmentRepository.save(department);
	}

	@Override
	public Iterable<Department> getAll() {
		Iterable<Department> result = this.departmentRepository.findAll();
		return result;
	}
	
	

}
