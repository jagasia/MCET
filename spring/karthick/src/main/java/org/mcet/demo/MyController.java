package org.mcet.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping
	public String home()
	{
		return "Hello welcome to my restful webservice";
	}
}
