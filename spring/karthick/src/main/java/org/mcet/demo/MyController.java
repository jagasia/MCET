package org.mcet.demo;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping
	public String home()
	{
		return "Hello welcome to my restful webservice";
	}
	
	@PostMapping
	public String post()
	{
		return "THis is post mapping. working fine";
	}
	
	@PutMapping
	public String put()
	{
		return "The put mapping works fine";
	}
	
	@DeleteMapping
	public String delete()
	{
		return "Delete works fine";
	}
	
}
