package org.mcet.spring.controller;

import java.util.List;
import java.util.Optional;

import org.mcet.spring.entity.Department;
import org.mcet.spring.repository.DepartmentRepository;
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
@RequestMapping("department")
public class DepartmentController {
	@Autowired
	private DepartmentRepository dr;
	
	@PostMapping
	public Department create(@RequestBody Department department) {
		return dr.save(department);
	}
	
	@GetMapping
	public List<Department> read() {
		return dr.findAll();
	}
	
	@GetMapping("/{id}")
	public Department read(@PathVariable("id") Integer id) {
		Optional<Department> temp = dr.findById(id);
		Department d=null;
		if(temp.isPresent())
		{
			d=temp.get();
		}
		return d;
	}
		
	
	@PutMapping
	public Department update(@RequestBody Department department) {
		Optional<Department> temp = dr.findById(department.getId());
		Department d=null;
		if(temp.isPresent())
		{
			d=department;
			dr.save(d);
		}
		return d;
	}
	
	@DeleteMapping("/{id}")
	public Department delete(@PathVariable("id") Integer id) {
		Optional<Department> temp = dr.findById(id);
		Department d=null;
		if(temp.isPresent())
		{
			d=temp.get();
			dr.delete(d);
		}
		return d;
	}
	
}
