package com.pfa.amicali.Repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.pfa.amicali.Entity.Product;

@CrossOrigin("*")
@Repository
@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {
	
	 @RestResource(path="/byProductname") public
	 List<Product>findByProductname(@Param("mc") String prodnom);
	 
	
	/*
	 * @Query("select p from Product p where p.pruduct.id=:x") Page<Product>
	 * getProducts(long id, PageRequest of);
	 */

}
