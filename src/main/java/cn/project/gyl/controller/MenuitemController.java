package cn.project.gyl.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.project.gyl.pojo.Privilege;
import cn.project.gyl.pojo.User;
import cn.project.gyl.service.MenuitemService;

@Controller
@RequestMapping("/menuitemController")
public class MenuitemController {
	
	@Autowired
	private MenuitemService menuitemService;

	@RequestMapping("/getByPid")
	@ResponseBody
	public Object getByPid(HttpSession session){
		Iterable<Privilege>result  = menuitemService.getMenuItemByUid(((User)session.getAttribute("user")).getUid());
		//return menuitemService.getAll();
		return result;
	}
}
