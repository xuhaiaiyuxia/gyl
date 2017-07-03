package cn.project.gyl.service;

import org.springframework.data.domain.Page;

import cn.project.gyl.config.exception.LoginException;
import cn.project.gyl.pojo.User;

public interface UserService {

	Page<User>getDeptList(Integer page);

	void deleteBatch(Long[] ids);
	
	void deleteById(Long id);

	void save(User user);

	User getUserById(Long id);

	void update(User user);

	Iterable<User> getAllUser();

	User findUserByUsername(User user)throws LoginException;
	
}
