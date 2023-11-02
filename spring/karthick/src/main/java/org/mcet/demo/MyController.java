package org.mcet.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	private List<String> countries=new ArrayList<>();
	
	@GetMapping
	public List<String> home()
	{
//		return "Hello welcome to my restful webservice";
		return countries;
	}
	
	@PostMapping("/{country}")
	public String post(@PathVariable("country") String country)
	{
		countries.add(country);
		return "THis is post mapping. working fine";
	}
	
	@PutMapping
	public String put()
	{
		return "The put mapping works fine";
	}
	
	@DeleteMapping("/{country}")
	public String delete(@PathVariable("country")String country)
	{
		String status="Not found";
		if(countries.contains(country))
		{
			countries.remove(country);
			status="Removed";
		}
		return status;
	}
	
}
