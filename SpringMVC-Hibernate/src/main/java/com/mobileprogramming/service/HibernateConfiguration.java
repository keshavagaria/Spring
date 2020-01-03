package com.mobileprogramming.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.mobileprogramming.model.Employee;

public class HibernateConfiguration {

	
	SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory();
	
	
	public void create()
	{
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Employee e=new Employee();
		e.setId(e.getId());
		e.setFirstName(e.getFirstName());
		e.setLastName(e.getLastName());
		session.save(e);
		transaction.commit();
		session.close();
	}
	
	
	public void retrieve()
	{
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Employee e=new Employee();
		Query query=session.createQuery("from Employee");
		List<Employee> list=query.list();
		for(Employee emp:list)
		{
			System.out.println(emp);
		}
		transaction.commit();
		session.close();
	}
	
	public void update(int id)
	{
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Employee e=(Employee)session.get(Employee.class, id);
		e.setId(e.getId());
		e.setFirstName(e.getFirstName());
		e.setLastName(e.getLastName());
		session.update(e);
		transaction.commit();
		session.close();
	}
	
	public void delete(int id)
	{
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Employee e=(Employee)session.get(Employee.class, id);
		session.delete(e);
		transaction.commit();
		session.close();
	}
}
