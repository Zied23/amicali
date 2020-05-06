package com.pfa.amicali.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.pfa.amicali.Entity.Product;
import com.pfa.amicali.Service.Product.PageProduct;
import com.pfa.amicali.Service.Product.ProductServiceImpl;
@CrossOrigin(origins = "http://localhost:8089")
@RestController
@RequestMapping(path = "/Product")
public class ProductController {
	@Autowired 
	private ProductServiceImpl productService;
	
//	
//	@GetMapping(value = "/products")
//	public List<Product>getProducts(){
//		
//		List<Product> products= productService.read();
//		return products;
//	}
//	 
	
	@RequestMapping(value = "/show", method = RequestMethod.GET)
    public List<Product> getProducts() {
       
        List<Product> products = new ArrayList<Product>();
        return products= productService.read();
       
    }
	
	
	@GetMapping(value = "/show/{id}")
	 public Optional<Product>getProducts(@PathVariable Long id){
		Optional<Product> products = productService.read(id);
	  return products;
	}
	
	
	
	
	@PostMapping(path= "/new/pruduct", consumes = "application/json", produces = "application/json")
    public void creatProduct(@RequestBody Product product){
       productService.create(product);
	
	}
	//provider/{id_provider}
	@RequestMapping(path= "/update/pruduct/{id}", consumes = "application/json", produces = "application/json" , method = RequestMethod.PUT)
    public void updateProduct(@RequestBody Product product,@PathVariable Long id)/*,@PathVariable Long id_provider)*/{
       productService.update(product, id);
	
    }
    //,id_provider
	
	@RequestMapping(value = "/remove/{id}", method = RequestMethod.DELETE)
	 public void deleteProduct(@PathVariable("id") long id) {
		//Product product = productService.getOne(id);
		 productService.delete(id);
	
	}
	
	
	
	
	
	
	
	
	/*
	 * @RequestMapping(value="/Product",method = RequestMethod.GET) public
	 * PageProduct getProducts(@RequestParam long id,
	 * 
	 * @RequestParam int page,
	 * 
	 * @RequestParam int size) { return productService.getProducts(id, page, size);
	 * 
	 * }
	 */
}
