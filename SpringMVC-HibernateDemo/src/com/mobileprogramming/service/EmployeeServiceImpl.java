package com.mobileprogramming.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileprogramming.dao.EmployeeDAO;
import com.mobileprogramming.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Transactional
	public void saveEmployee(Employee employee) {
		employeeDAO.saveEmployeeObj(employee);
		
	}

    @Transactional
	public List<Employee> getAllEmployee() {
		
		return employeeDAO.getAllEmployees();
	}

}
