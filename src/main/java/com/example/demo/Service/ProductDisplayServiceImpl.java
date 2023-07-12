package com.example.demo.Service;

import java.util.List;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.example.demo.Modell.Product;
import com.example.demo.Repository.ProductDisplayRepository;

	
	@Service
	public class ProductDisplayServiceImpl  implements ProductDisplayService {
		@Autowired
		private ProductDisplayRepository repo ;

		@Override
		public Product addProduct(Product product) {

			return repo.save(product);
		}

		@Override
		public Product updateProduct(Product product) {
			return repo.save(product);
		}


		public Product viewProduct(int prodId) {
			return repo.findById(prodId).orElse(new Product());
		}

		@Override
	public List<Product> viewAllProducts() {

		return repo.findAll();
		}

		@Override
		public  Product cancelProduct(Product product) {
			repo.delete(product);
			return product;
		}


		@Override
		public List<Product> showAllProduct() {
			
			return repo.findAll();
		}

		@Override
		public Product deleteProduct(Integer id) {
			// TODO Auto-generated method stub
			Product product = repo.findById(id).get();
			repo.delete(product);
			return product;
		}

		@Override
		public Product getProduct(Integer productId) {
			// TODO Auto-generated method stub
			 Product product = repo.findById(productId).get();
			repo.findById(productId);
			return product;
		}

//		@Override
//		public Product updateProduct(Integer id, Product product) {
//			// TODO Auto-generated method stub
//			Product existing = repo.findById(id).get();
//			repo.findById(id ).orElseThrow(()-> new RuntimeException("No Product Available with ID :: "+id));
//			if(product.getProductName()!=null)
//				existing.setProductName(product.getProductName());
//			if(product.getProductPrice()!=null)
//				existing.setProductPrice(product.getProductPrice());
//			    
//			 return repo.save(existing);
//			 
		//}
		
	
//		public Product deleteProduct(int prodId) {
//			Product product = repo.findById(prodId).get();
//			repo.delete(product);
//			return product;
//		}
	}

