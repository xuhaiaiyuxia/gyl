package cn.project.gyl.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import cn.project.gyl.pojo.Menuitem;

public interface MenuitemRepository extends CrudRepository<Menuitem, Long>,PagingAndSortingRepository<Menuitem, Long>{

	List<Menuitem> findByPid(Long pid);

	

}
