package org.mcet.demo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
    	EmployeeDao edao= (EmployeeDao) ctx.getBean("edao");
    	Employee e=new Employee(null, "Suresh", "MBA");
    	edao.create(e);
    	
//    	edao.update(e);
    	
//    	edao.delete(2);
    	
    	List<Employee> employeeList = edao.read();
    	for(Employee emp: employeeList)
    		System.out.println(emp);

//    	Employee result = edao.read(13);
    	
    	
    	System.out.println( "Hello World!" );
        
    }
}
