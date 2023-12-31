package org.mcet.spring.entity;

import org.mcet.spring.entity.Department;

public class Employee {
	private Integer id;
	private String name;
	private Department department;
	
	public Employee() {}

	public Employee(Integer id, String name, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	
	
	
}
