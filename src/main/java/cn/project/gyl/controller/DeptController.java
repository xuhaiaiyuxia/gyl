package cn.project.gyl.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.project.gyl.pojo.Department;
import cn.project.gyl.service.DeptService;

@Controller
@RequestMapping("/deptController")
public class DeptController {
	
	@Autowired
	private DeptService deptService;

	@RequestMapping("/list")
	@ResponseBody
	public Iterable<Department> list(@RequestParam(defaultValue="1") Integer page,
		@RequestParam(defaultValue="10")Integer size){
		Page<Department> result = deptService.getDeptList(page, size);
		return result;
	}
	
	@RequestMapping("/department")
	public String department(){
		
		return "base/department/department";
	}
	
	@RequestMapping("/update/{id}")
	public String update(@PathVariable("id")Long id,Model model){
		model.addAttribute("id", id);
		return "base/department/update";
	}
	
	@RequestMapping("/updateinfo/{id}")
	@ResponseBody
	public Department updateinfo(@PathVariable("id")Long id){
		Department department = this.deptService.findDeptInfoById( id);
		return department;
	}
	@RequestMapping("/updatedept")
	@ResponseBody
	public Map<String, Object> updatedept(Department department){
		Map<String, Object> map = new HashMap<String, Object>();
		this.deptService.update(department);
		map.put("status", "success");
		return map;
	}
	
	@RequestMapping("/getAll")
	@ResponseBody
	public Object getAll(){
		Iterable<Department>depts = this.deptService.getAll();
		return depts;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
