package org.mcet.spring.controller;

import java.util.List;

import org.mcet.spring.api.DepartmentApi;
import org.mcet.spring.entity.Department;
import org.mcet.spring.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("department")
public class DepartmentController {
	@Autowired
	private DepartmentApi da;

	@GetMapping
	public ModelAndView showDepartmentPage()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("department");
		mv.addObject("department", new Department());
		List<Department> departments = da.read();
		mv.addObject("departments", departments);
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "dml", params = "add")
	public ModelAndView add(Department department)
	{
		da.create(department);
		return showDepartmentPage();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "dml", params = "update")
	public ModelAndView update(Department department)
	{
		da.update(department);
		return showDepartmentPage();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "dml", params = "delete")
	public ModelAndView delete(Department department)
	{
		da.delete(department.getId());
		return showDepartmentPage();
	}
	
	@GetMapping("/select")
	public ModelAndView select(@RequestParam("id") Integer id)
	{
		Department department = da.read(id);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("department");
		mv.addObject("department", department);
		List<Department> departments = da.read();
		mv.addObject("departments", departments);
		return mv;
	}
	
	@GetMapping("/view/{id}")
	public ModelAndView view(@PathVariable("id") Integer id)
	{
		Department department = da.read(id);
		System.out.println(department);
		List<Employee> employees = department.getEmployees();
		
		ModelAndView mv=new ModelAndView();
		mv.addObject("employees",employees);
		mv.setViewName("view");
		return mv;
	}
}
