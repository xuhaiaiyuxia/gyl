package cn.project.gyl.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.project.gyl.config.exception.ErrorPasswordException;
import cn.project.gyl.config.exception.LoginException;
import cn.project.gyl.config.exception.UsernameNotExistException;
import cn.project.gyl.pojo.User;
import cn.project.gyl.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String loginUI(){
		
		return "login";
	}
	
	@PostMapping("/login")
	@ResponseBody
	public Object login(User user,HttpSession session){
		Map<String, Object>map = new HashMap<String, Object>();
		try {
			User u = userService.findUserByUsername(user);
			session.setAttribute("user", u);
		} catch (LoginException e) {
			map.put("status", "error");
			if(e instanceof UsernameNotExistException){
				map.put("msg", "用户名不存在");
			}else if(e instanceof ErrorPasswordException){
				map.put("msg", "密码错误");
			}
			return map;
		}
		map.put("status", "success");
		return map;
	}
}
