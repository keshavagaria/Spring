package com.mobileprogramming.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.mobileprogramming.model.Employee;


public interface EmployeeService {
		void saveEmployee(Employee employee);

		 List<Employee> getAllEmployee();
}
