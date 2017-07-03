package cn.project.gyl.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import cn.project.gyl.pojo.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long>,PagingAndSortingRepository<Department, Long>{

}
