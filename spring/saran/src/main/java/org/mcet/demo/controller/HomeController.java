package org.mcet.demo.controller;

import java.util.List;
import java.util.Optional;

import org.mcet.demo.entity.Product;
import org.mcet.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@Autowired
	private ProductRepository pr;
	
	@GetMapping
	public ModelAndView home()
	{
		List<Product> products = pr.findAll();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		mv.addObject("products", products);
		return mv;
	}
	
	@RequestMapping(value = "/btn", method = RequestMethod.POST, params = "add" )
//	@ResponseBody
	public ModelAndView add(Product product)
	{
		pr.save(product);
		return home();
	}
	
	@RequestMapping(value = "/btn", method = RequestMethod.POST, params = "update" )
//	@ResponseBody
	public ModelAndView update(Product product)
	{
		Optional<Product> temp = pr.findById(product.getId());
		Product p=null;
		if(temp.isPresent())
		{
			p=product;
			pr.save(p);
		}
		return home();
	}
	
	@RequestMapping(value = "/btn", method = RequestMethod.POST, params = "delete" )
//	@ResponseBody
	public ModelAndView delete(Product product)
	{
		Optional<Product> temp = pr.findById(product.getId());
		Product p=null;
		if(temp.isPresent())
		{
			p=product;
			pr.delete(p);
		}
		return home();
	}
	
}
