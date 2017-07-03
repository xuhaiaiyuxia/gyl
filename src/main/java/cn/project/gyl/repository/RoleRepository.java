package cn.project.gyl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import cn.project.gyl.pojo.Role;

public interface RoleRepository extends CrudRepository<Role, Long>, PagingAndSortingRepository<Role, Long> {

	Role findByName(String name);

	@Query("select r from Role r inner join r.users u where u.uid=?1")
	List<Role> getRoleByUid(Long uid);

}
