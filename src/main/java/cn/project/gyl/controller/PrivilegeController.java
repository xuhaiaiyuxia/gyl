package cn.project.gyl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.project.gyl.pojo.Privilege;
import cn.project.gyl.service.PrivilegeService;

@Controller
@RequestMapping("/privilegeController")
public class PrivilegeController {
	
	@Autowired
	private PrivilegeService privilegeService;

	@RequestMapping("/showPrivilegeTree")
	@ResponseBody
	public Object showPrivilegeTree(Long rid){
		Iterable<Privilege>list = privilegeService.getAll(rid);
		return list;
	}
	
	@RequestMapping("/savePrivilege")
	@ResponseBody
	public Object savePrivilege(Long rid,String checkedStr){
		this.privilegeService.allocateRolePrivilege(rid,checkedStr);
		return 123;
	}
}
