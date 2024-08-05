package com.Empoyee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "HttpStatus.NOT_FOUND")
public class ResourceNotFoundException extends RuntimeException{
	public ResourceNotFoundException(String message) {
		super(message);
	}

}
