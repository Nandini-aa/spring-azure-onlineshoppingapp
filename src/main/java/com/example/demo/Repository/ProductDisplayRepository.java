package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.Modell.Product;

@Repository
@EnableMongoRepositories
public interface ProductDisplayRepository  extends MongoRepository<Product, Integer>{


	
}



