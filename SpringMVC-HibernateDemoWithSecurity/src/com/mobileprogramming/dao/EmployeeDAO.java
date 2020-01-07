package com.mobileprogramming.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mobileprogramming.model.Employee;


public interface EmployeeDAO {
	 public void saveEmployeeObj(Employee employee);

	public List<Employee> getAllEmployees();

	
}
