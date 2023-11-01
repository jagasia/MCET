package com.mphasis.hrms.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.mphasis.hrms.controller.model.Branch;
import com.mphasis.hrms.controller.model.BranchDao;

@RequestMapping("/employee")
@Controller
public class MyController {
	
	@RequestMapping("/")
	public ModelAndView home()
	{
		//retrieve all branches as List<Branch> and store it in model and redirect to index page
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		BranchDao bdao=(BranchDao) ctx.getBean("bdao");
		List<Branch> branches = bdao.read();
		ModelAndView mv=new ModelAndView();
		mv.addObject("branches", branches);
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/one")
	public String login()
	{
		return "login";
	}
	
	@PostMapping("/validate")
	public ModelAndView validate(String username, String password)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("username", username);
		mv.addObject("role", "admin");
		mv.setViewName("home");
		return mv;
	}
	
	@GetMapping("/validate")
	@ResponseBody
	public String validateMethod()
	{
		return "You cannot reach this by browser addres ";
	}
}
