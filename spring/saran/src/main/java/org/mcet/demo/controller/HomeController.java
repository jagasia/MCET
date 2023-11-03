package org.mcet.demo.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.servlet.annotation.MultipartConfig;

import org.mcet.demo.entity.Product;
import org.mcet.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@CrossOrigin({"*","http://localhost:4200"})
@MultipartConfig
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
	
//	@RequestMapping(value = "/btn", method = RequestMethod.POST, params = "add" )
////	@ResponseBody
//	public ModelAndView add(Product product)
//	{
//		pr.save(product);
//		return home();
//	}
	
	@RequestMapping(value = "/btn", method = RequestMethod.POST, params = "add" )
//	@ResponseBody
	public ModelAndView add(@RequestParam("name") String name,@RequestParam("price") Double price,@RequestParam("pic") MultipartFile file) throws IOException
	{
		Product product=new Product(null, name, price, file.getBytes());
		pr.save(product);
		return home();
	}
	
	@RequestMapping(value = "/btn", method = RequestMethod.POST, params = "update" )
//	@ResponseBody
	public ModelAndView update(@RequestParam("id") Integer id,@RequestParam("name") String name,@RequestParam("price") Double price,@RequestParam("pic") MultipartFile file) throws IOException
	{
		Product product=new Product(id, name, price, file.getBytes());
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
	public ModelAndView delete(@RequestParam("id") Integer id)
	{
		Optional<Product> temp = pr.findById(id);
		Product p=null;
		if(temp.isPresent())
		{
			p=temp.get();
			pr.delete(p);
		}
		return home();
	}
	
}
