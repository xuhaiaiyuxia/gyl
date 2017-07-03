package cn.project.gyl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.project.gyl.pojo.Role;
import cn.project.gyl.service.RoleService;

@Controller
@RequestMapping("/roleController")
public class RoleController {
	
	@Autowired
	private RoleService roleService;

	@RequestMapping("/showRoleTree")
	@ResponseBody
	public Object showRoleTree(){
		return roleService.getAllRole();
	}
	
	@RequestMapping("/toRoleUI")
	public String toRoleUI(){
		
		return "base/role/role";
	}
	
	@RequestMapping("/showRoleByName")
	@ResponseBody
	public Object showRoleByName(String name){
		Role role = this.roleService.getRoleByName(name);
		return role==null?"1":"0";
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public Object add(Role role){
		Role r = this.roleService.save(role);
		return r;
	}
	
	
	@RequestMapping("/deleteRole")
	@ResponseBody
	public Object deleteRole(Long rid){
		this.roleService.deleteById(rid);
		return 123;
	}
	
	
	@RequestMapping("/updateRole")
	@ResponseBody
	public Object updateRole(Long rid,String name){
		this.roleService.update(rid,name);
		return 123;
	}
	
	@RequestMapping("/getAll")
	@ResponseBody
	public Object getAll(){
		Iterable<Role> roles = this.roleService.getAllRole();
		return roles;
	}
	
	
	@RequestMapping("/showRoleByUid")
	@ResponseBody
	public Object showRoleByUid(Long uid){
		Iterable<Role> roles = this.roleService.getRoleByUid(uid);
		return roles;
	}
	
	
	@RequestMapping("/saveRole")
	@ResponseBody
	public Object saveRole(Long uid,String checkedStr){
		this.roleService.saveRole(uid,checkedStr);
		return 123;
	}
	
	
	@RequestMapping("/toRolePrivilegeUI")
	public String toRolePrivilegeUI(){
		return "privilege/role_privilege";
	}
	
	
	@RequestMapping("/toRoleUserUI")
	public String toRoleUserUI(){
		return "privilege/user_role";
	}
	
	
	
	
	
	
}
