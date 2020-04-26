package com.capgemini.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.demo.dao.EmployeeDAO;
import com.capgemini.demo.model.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDAO empdao;
	
		
	@RequestMapping("/employees")
	@ResponseBody
	public List<Employee> getEmployee() {
				
		return empdao.findAll();
		
	
	}
	
	
	@RequestMapping("/employees/{empid}")
	@ResponseBody
	public Optional<Employee> getEmployee(@PathVariable int empid) 
	{
				
		return empdao.findById(empid);
		
	
	}
}
