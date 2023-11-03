package org.mcet.demo.repository;

import java.util.List;

import org.mcet.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>
{
	//find products by name
	public List<Product> findByName(String name);
	
//	@Query(value="from Product p where p.name=:name",nativeQuery = true)
	@Query("from Product p where p.name like %:name%")
	public List<Product> findProductsByName(String name);
}
