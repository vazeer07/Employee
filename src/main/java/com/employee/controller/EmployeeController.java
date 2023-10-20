package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.Employee;
import com.employee.exception.GenderNotFoundException;
import com.employee.exception.IdNotFoundException;
import com.employee.exception.SalaryNotFoundException;
import com.employee.service.EmployeeService;

@RestController

public class EmployeeController {
	@Autowired
	EmployeeService es;
	
	@PostMapping(path="/postAllDetails")
	public String postDetail(@RequestBody List<Employee> le) {
		return es.postDetail(le);
	}
	
	@PostMapping(path="/postAllDetails1")
	public String postAllDetail(@RequestBody List<Employee> le) throws SalaryNotFoundException {
		return es.postAllDetail(le);
	}
	
	@PostMapping(path="/postAllDetails2")
	public String postAllDetail1(@RequestBody List<Employee> le) throws GenderNotFoundException {
		return es.postAllDetail1(le);
	}
	
	@GetMapping(path="/getById/{x}")
	public Employee getValueById(@PathVariable int x) throws IdNotFoundException{
		return es.getValueById(x);
	}
	
	
	

}
