package cn.project.gyl.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import cn.project.gyl.pojo.User;

public interface UserRepository
		extends CrudRepository<User, Long>, PagingAndSortingRepository<User, Long>, JpaSpecificationExecutor<User> {


}
