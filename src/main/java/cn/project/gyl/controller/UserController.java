package cn.project.gyl.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.project.gyl.pojo.User;
import cn.project.gyl.service.UserService;

@Controller
@RequestMapping("/userController")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/user")
	public String user(){
		
		return "base/user/user";
	}
	
	@RequestMapping("/list/{page}")
	@ResponseBody
	public Object list(@PathVariable Integer page){
		if(page==null) page=1;
		Page<User> result = userService.getDeptList(page);
		return result;
	}
	
	@RequestMapping("/deleteBatch")
	@ResponseBody
	public Object deleteBatch(Long[] ids,Integer page){
		this.userService.deleteBatch(ids);
		Page<User> result = userService.getDeptList(page);
		return result;
	}
	
	@RequestMapping("/addUI")
	public String addUI(){
		
		return "base/user/add";
	}
	
	
	@RequestMapping("/save")
	@ResponseBody
	public Object save(@RequestBody User user){
		Map<String, Object>map = new HashMap<String, Object>();
		this.userService.save(user);
		map.put("status", "success");
		return map;
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public Object update(@RequestBody User user){
		Map<String, Object>map = new HashMap<String, Object>();
		this.userService.save(user);
		map.put("status", "success");
		return map;
	}
	
	@RequestMapping("/toUpdateUI/{id}")
	public String toUpdateUI(@PathVariable Long id,Model model){
		model.addAttribute("id", id);
		return "base/user/update";
	}
	
	@RequestMapping("/getUserById/{id}")
	@ResponseBody
	public Object getUserById(@PathVariable Long id){
		User user = this.userService.getUserById(id);
		return user;
	}
	@RequestMapping("/getAll")
	@ResponseBody
	public Object getAll(){
		Iterable<User>result = this.userService.getAllUser();
		return result;
	}
	
	
	
	
	
	
	
	
	
}
