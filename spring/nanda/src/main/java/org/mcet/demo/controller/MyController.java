package org.mcet.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@GetMapping
	public String home()
	{
		return "index";
	}
	
	@GetMapping("/about")
	public String aboutus()
	{
		return "aboutus";
	}
	
	@GetMapping("/contact")
	@ResponseBody
	public String contactus()
	{
		return "contact.";
	}
}
