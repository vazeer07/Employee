package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.employee.dao.EmployeeDao;
import com.employee.entity.Employee;
import com.employee.exception.GenderNotFoundException;
import com.employee.exception.IdNotFoundException;
import com.employee.exception.SalaryNotFoundException;

@Service

public class EmployeeService {

	@Autowired
	EmployeeDao ed;
	public String postDetail(List<Employee> le) {
		return ed.postDetail(le);
	}
	
	public String postAllDetail(List<Employee> le) throws SalaryNotFoundException {
		List<Employee> kk = le.stream().filter(x->x.getSalary()>50000).toList();
		if(kk.isEmpty()) {
			throw new SalaryNotFoundException("ITs Not available");
		}
		else {
			
			
			return ed.postAllDetail(kk);
		}
	}
	
	
	public String postAllDetail1(List<Employee> lk) throws GenderNotFoundException {
		List<Employee> jj = lk.stream().filter(x->x.getGender().equalsIgnoreCase("Male")).toList();
		if(jj.isEmpty()) {
			
			throw new GenderNotFoundException("Its Not Available Gender");
		}
		else {
			return ed.postAllDetail1(jj);
		}
	}
	
	public Employee getValueById(int y) throws IdNotFoundException {
		return ed.getValueById(y);
	}
}
