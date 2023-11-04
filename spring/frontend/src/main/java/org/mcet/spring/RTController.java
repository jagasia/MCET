package org.mcet.spring;

import org.mcet.spring.entity.Department;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/jag")
public class RTController {
	
	@GetMapping
	public Department home()
	{
		//http://localhost:5000/department/1
		RestTemplate rt=new RestTemplate();
		Department result = rt.getForObject("http://localhost:5000/department/1", Department.class);
		return result;
	}
}
