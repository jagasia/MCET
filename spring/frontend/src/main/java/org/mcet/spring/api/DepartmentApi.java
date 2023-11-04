package org.mcet.spring.api;

import java.util.List;
import java.util.Optional;

import org.mcet.spring.entity.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "department-api",url = "http://localhost:5000/department")
public interface DepartmentApi {

	@PostMapping
	public Department create(@RequestBody Department department);
	
	@GetMapping
	public List<Department> read();
	
	@GetMapping("/{id}")
	public Department read(@PathVariable("id") Integer id);
		
	
	@PutMapping
	public Department update(@RequestBody Department department);
		
	
	@DeleteMapping("/{id}")
	public Department delete(@PathVariable("id") Integer id);
}
