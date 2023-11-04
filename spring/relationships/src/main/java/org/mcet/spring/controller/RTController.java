package org.mcet.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jag")
public class RTController {
	
	@GetMapping
	public String home()
	{
		return "Hello world";
	}
}
