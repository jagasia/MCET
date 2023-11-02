package org.mcet.demo;

import java.util.ArrayList;
import java.util.List;

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
	private List<Product> products=new ArrayList<>();
	
	@PostMapping
	public Product create(@RequestBody Product product) {
		products.add(product);
		return product;
	}
	
	@GetMapping
	public List<Product> read() {
		return products;
	}
	
	@GetMapping("/{id}")
	public Product read(@PathVariable("id") Integer id) {
		Product temp=null;
		for(Product p : products)
		{
			if(p.getId().equals(id))
			{
				temp=p;
				break;
			}
		}
		return temp;
	}
	
	@PutMapping
	public Product update(@RequestBody Product product) {
		Product temp=null;
		for(Product p : products)
		{
			if(p.getId().equals(product.getId()))
			{
				temp=p;
				p=product;
				break;
			}
		}
		return temp;
	}
	
	@DeleteMapping("/{id}")
	public Product delete(@PathVariable("id") Integer id) {
		Product temp=null;
		for(Product p : products)
		{
			if(p.getId().equals(id))
			{
				temp=p;
				products.remove(p);
				break;
			}
		}
		return temp;
	}
	
}
