package com.mobileprogramming.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobileprogramming.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveEmployeeObj(Employee employee) {
			sessionFactory.getCurrentSession().saveOrUpdate(employee);
	}
	@Override
	public List<Employee> getAllEmployees() {
		return sessionFactory.getCurrentSession().createQuery("from Employee").list();
		
	}

}
