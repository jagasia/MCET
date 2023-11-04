package org.mcet.spring.controller;

import java.util.List;
import java.util.Optional;

import org.mcet.spring.entity.Employee;
import org.mcet.spring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	@Autowired
	private EmployeeRepository er;
	
	@PostMapping
	public Employee create(@RequestBody Employee employee) {
		return er.save(employee);
	}
	
	@GetMapping
	public List<Employee> read() {
		return er.findAll();
	}
	
	@GetMapping("/{id}")
	public Employee read(@PathVariable("id") Integer id) {
		Optional<Employee> temp = er.findById(id);
		Employee d=null;
		if(temp.isPresent())
		{
			d=temp.get();
		}
		return d;
	}
		
	
	@PutMapping
	public Employee update(@RequestBody Employee employee) {
		Optional<Employee> temp = er.findById(employee.getId());
		Employee d=null;
		if(temp.isPresent())
		{
			d=employee;
			er.save(d);
		}
		return d;
	}
	
	@DeleteMapping("/{id}")
	public Employee delete(@PathVariable("id") Integer id) {
		Optional<Employee> temp = er.findById(id);
		Employee d=null;
		if(temp.isPresent())
		{
			d=temp.get();
			er.delete(d);
		}
		return d;
	}
	
}
