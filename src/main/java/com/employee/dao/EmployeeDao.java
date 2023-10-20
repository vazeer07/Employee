package com.employee.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.employee.entity.Employee;
import com.employee.exception.IdNotFoundException;
import com.employee.exception.SalaryNotFoundException;
import com.employee.repository.EmployeeRepository;

@Repository

public class EmployeeDao {
	
	@Autowired
	EmployeeRepository er;
	
	public String postDetail(List<Employee> le) {
		er.saveAll(le);
		return "Saved All details Successfully";
	}
	
	public String postAllDetail(List<Employee> le) {
		er.saveAll(le);
		return "Saved Remaining Value Sucessfully";
	}
	
	
	public String postAllDetail1(List<Employee> le){
		er.saveAll(le);
		return "Saved Remaining Gender Successfully";
	}
	
	public Employee getValueById(int z) throws IdNotFoundException{
		return er.findById(z).orElseThrow(()->new IdNotFoundException("NOT A VALID ID"));
	}

}
