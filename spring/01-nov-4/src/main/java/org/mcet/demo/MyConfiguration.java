package org.mcet.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.mcet"})
public class MyConfiguration {
	
	@Bean
	public Author author()
	{
		return new Author(1, "Bala", "Guruswamy");
	}
}
