package org.mcet.demo;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class EmployeeDao {
	
	private HibernateTemplate ht;
	
	
	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

	@Transactional
	public void create(Employee employee) {
		//adding a new row in EMPLOYEE table
		ht.save(employee);
	}
	
	public List<Employee> read() {
		return ht.loadAll(Employee.class);
	}
	
	public Employee read(Integer id) {
		return ht.get(Employee.class, id);
	}
	
	@Transactional
	public void update(Employee employee) {
		Employee temp = read(employee.getId());
		if(temp!=null)
		{
			temp.setName(employee.getName());
			temp.setDepartment(employee.getDepartment());
			ht.update(temp);
		}		
	}
	
	@Transactional
	public void delete(Integer id) {
		Employee temp = read(id);
		if(temp!=null)
		{
			ht.delete(temp);
		}
	}
	
	
}
