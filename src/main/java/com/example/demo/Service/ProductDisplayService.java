package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Modell.Product;

 
@Component
	public interface ProductDisplayService {

		Product addProduct(Product product);

		Product updateProduct(Product product); 
		

		Product cancelProduct(Product product);  //(deleting the whole product by passing body)

		List<Product> showAllProduct();

		List<Product> viewAllProducts();

	   Product deleteProduct(Integer id);  //deleting product by id

	    Product getProduct(Integer productId); //get product by productid
	}


