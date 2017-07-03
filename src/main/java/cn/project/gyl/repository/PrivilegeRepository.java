package cn.project.gyl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import cn.project.gyl.pojo.Privilege;

public interface PrivilegeRepository
		extends CrudRepository<Privilege, Long>, PagingAndSortingRepository<Privilege, Long> {

	@Query("select p from Privilege p inner join p.roles r where r.rid =?1")
	List<Privilege> findPrivilegeByRoleId(Long rid);

	@Query("select p from Privilege p inner join p.roles r inner join r.users u where u.uid=?1 and type='1'")
	Iterable<Privilege> getMenuItemByUid(Long uid);
	
	@Query("from Privilege p where type='1'")
	Iterable<Privilege> getAdminMenuItem();

}
