package com.example.demo.Exception;



import org.springframework.web.bind.annotation.ResponseStatus;

import org.springframework.http.HttpStatus;

//@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProductDisplayNotFoundException extends Exception {
	  public ProductDisplayNotFoundException(String message)
	    {
	        super(message);
	    }

}

