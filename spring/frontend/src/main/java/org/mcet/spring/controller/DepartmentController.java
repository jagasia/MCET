package org.mcet.spring.controller;

import java.util.List;

import org.mcet.spring.api.DepartmentApi;
import org.mcet.spring.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
