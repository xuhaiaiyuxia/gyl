package cn.project.gyl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UIController {

	@RequestMapping("/main")
	public String main(){
		
		return "main";
	}
	@RequestMapping("/left")
	public String left(){
		
		return "left";
	}
	@RequestMapping("/top")
	public String top(){
		
		return "top";
	}
	@RequestMapping("/center")
	public String center(){
		
		return "center";
	}
	@RequestMapping("/right")
	public String right(){
		
		return "right";
	}
}
