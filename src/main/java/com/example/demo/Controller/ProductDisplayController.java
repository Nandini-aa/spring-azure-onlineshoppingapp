package com.example.demo.Controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Modell.Product;
import com.example.demo.Service.ProductDisplayService;


@RestController
public class ProductDisplayController {
	@Autowired
	private ProductDisplayService service;
	
//	//http:localhost:9090/welcome
//	@GetMapping("/welcome")
//	public String welcome() {
//		return "Welcome this is online shopping app";
//	}
	
	//view products
	@CrossOrigin(origins = "*")
	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return service.showAllProduct();
	}
	//get product by id 
	@GetMapping("/products/{id}")
	public Product getProduct(@PathVariable("id") Integer id) {
		return service.getProduct(id);
	}
	
	//adding products
	@CrossOrigin(origins = "*")
	@PostMapping("/addproduct")
	public Product addProduct(@RequestBody Product product){
		return service.addProduct(product);
	}
	
	//updating product details
	@CrossOrigin(origins = "*")
	@PutMapping("/updateproduct")
	public Product updateProduct(@RequestBody Product product){
		return service.updateProduct(product);
	}
	
	//deleting the product
	@CrossOrigin(origins = "*")
	@DeleteMapping("/deleteproduct")
	public Product deleteProduct(@RequestBody Product product){
		return service.cancelProduct(product);
	}
//deleting the product by id
	@CrossOrigin(origins = "*")
	@DeleteMapping("/deleteproducts/{id}")
	public Product deleteProduct(@PathVariable("id") Integer id) {
		
		return service.deleteProduct(id);
	}
	
	
	
}
