package com.mobileprogramming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mobileprogramming.model.Employee;
import com.mobileprogramming.service.EmployeeService;

@Controller
public class AppController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value="/home", method=RequestMethod.GET)  
    public String home() {  
        return "home";  
    }  
      
    @RequestMapping(value="/admin", method=RequestMethod.GET)  
    public String privateHome() {  
        return "privatePage";  
    }  
    
    
	@RequestMapping(value="/addEmployeeDetails")
	public String displayEmployeeForm(Model model)
	{
		Employee employee=new Employee();
		model.addAttribute("emp",employee);
		return "addEmployee";
	}

	@RequestMapping(value="/saveEmployee")
	public String saveEmployeeDetails(@ModelAttribute("emp")Employee employee)
	{
		employeeService.saveEmployee(employee);
		return "listEmployee";
	}

	@RequestMapping(value="/listEmployee")
	public String getAllEmployee(Model model)
	{
		List<Employee> employees=employeeService.getAllEmployee();
		model.addAttribute("employees",employees);
		return "listEmployee";
	}
}