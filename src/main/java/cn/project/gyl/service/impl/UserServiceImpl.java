package cn.project.gyl.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.project.gyl.config.exception.ErrorPasswordException;
import cn.project.gyl.config.exception.LoginException;
import cn.project.gyl.config.exception.UsernameNotExistException;
import cn.project.gyl.pojo.User;
import cn.project.gyl.repository.UserRepository;
import cn.project.gyl.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Value("${my.default.page-size}")
	private Integer pageSize;
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public Page<User> getDeptList(Integer page) {
		Page<User> result = userRepository.findAll(new PageRequest(page-1==-1?0:page-1, pageSize));
		return result;
	}

	@Override
	public void deleteBatch(Long[] ids) {
		for (Long id : ids) {
			this.userRepository.delete(id);
		}
		
	}

	@Override
	public void deleteById(Long id) {
		this.userRepository.delete(id);
		
	}

	@Override
	public void save(User user) {
		user.setPassword("111111");
		this.userRepository.save(user);
	}

	@Override
	public User getUserById(Long id) {
		User user = this.userRepository.findOne(id);
		return user;
	}

	@Override
	public void update(User user) {
		User user_old = this.userRepository.findOne(user.getUid());
		user_old.setDepartment(user.getDepartment());
		user_old.setEmail(user.getEmail());
		user_old.setPassword(user.getPassword());
		user_old.setPhone(user_old.getPhone());
		user_old.setSex(user_old.getSex());
		user_old.setUsername(user_old.getUsername());
		this.userRepository.save(user_old);
	}

	@Override
	public Iterable<User> getAllUser() {
		
		return this.userRepository.findAll();
	}

	@Override
	public User findUserByUsername(User user) throws LoginException {
		List<User> list = this.userRepository.findAll((root,query,cb)->{
			return cb.equal(root.get("username"),user.getUsername());
		});
		if(list==null||list.size()==0) throw new UsernameNotExistException();
		if(!user.getPassword().equals(list.get(0).getPassword()))throw new ErrorPasswordException();
		return list.get(0);
	}

}
