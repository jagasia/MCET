package org.mcet.spring.api;

import java.util.List;
import java.util.Optional;

import org.mcet.spring.entity.Employee;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "employee-api",url = "http://localhost:5000/employee")
public interface EmployeeApi {
	@PostMapping
	public Employee create(@RequestBody Employee employee);
	
	@GetMapping
	public List<Employee> read();
	
	@GetMapping("/{id}")
	public Employee read(@PathVariable("id") Integer id);
		
	
	@PutMapping
	public Employee update(@RequestBody Employee employee);
	
	@DeleteMapping("/{id}")
	public Employee delete(@PathVariable("id") Integer id);
}
