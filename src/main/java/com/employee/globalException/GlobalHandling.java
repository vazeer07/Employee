package com.employee.globalException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.employee.exception.IdNotFoundException;
import com.employee.exception.SalaryNotFoundException;

@RestControllerAdvice

public class GlobalHandling {
	
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<Object> idHandling(){
	return new ResponseEntity<>("Sorry this not valid Id", HttpStatus.BAD_REQUEST);
	}
	
		
    @ExceptionHandler(SalaryNotFoundException.class)
	public ResponseEntity<Object> salaryHandling() {
    	return new ResponseEntity<>("Sorry this is Not Valid salary", HttpStatus.BAD_REQUEST);
    }
    
	
	

}