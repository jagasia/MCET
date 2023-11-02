package org.mcet.demo.controller;

import java.util.List;
import java.util.Optional;

import org.mcet.demo.entity.Product;
import org.mcet.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductRepository pr;
	
	@PostMapping
	public Product create(@RequestBody Product product) {
		return pr.save(product);
	}
	
	@GetMapping
	public List<Product> read() {
		return pr.findAll();
	}
	
	@GetMapping("/{id}")
	public Product read(@PathVariable("id") Integer id) {
		Optional<Product> temp = pr.findById(id);
		Product p=null;
		if(temp.isPresent())
		{
			p=temp.get();
		}
		return p;
	}
	
	@PutMapping
	public Product update(@RequestBody Product product) {
		Product p = read(product.getId());
		if(p!=null)
		{
			pr.save(product);
		}
		return p;
	}
	
	@DeleteMapping("/{id}")
	public Product delete(@PathVariable("id") Integer id) {
		Product p = read(id);
		if(p!=null)
		{
			pr.delete(p);
		}
		return p;
	}
	
}
