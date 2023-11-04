package org.mcet.spring.controller;

import java.util.Collections;
import java.util.List;

import org.mcet.spring.api.DepartmentApi;
import org.mcet.spring.api.EmployeeApi;
import org.mcet.spring.entity.Department;
import org.mcet.spring.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeApi ea;
	
	@Autowired
	private DepartmentApi da;
	
	@GetMapping
	public ModelAndView showEmployeePage()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("employee");
		List<Employee> employees = ea.read();
		System.out.println(employees.size());
		mv.addObject("employees",employees);
		List<Department> departments = da.read();
		Collections.sort(departments,(a,b)->a.getName().compareTo(b.getName()));
		mv.addObject("departments",departments);
		System.out.println("done");
		return mv;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "dml", params = "add")
	public ModelAndView dml(@RequestParam("id") Integer id, @RequestParam("name") String name,@RequestParam("departmentId") Integer departmentId) {
		Employee employee=new Employee();
		employee.setId(id);
		employee.setName(name);
		Department department = da.read(departmentId);
//		if(department!=null)
		employee.setDepartment(department);
		System.out.println(employee);
		System.out.println(employee.getDepartment());
		ea.create(employee);
		
		return showEmployeePage();
	}
}
