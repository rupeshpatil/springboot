package com.capgemini.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.demo.dao.EmployeeDAO;
import com.capgemini.demo.model.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeDAO empdao;
	
	
	@PostMapping("/employee")
	public Employee addEmployee(Employee emp) {
		
		empdao.save(emp);
		
		return emp;
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployee() {
				
		return empdao.findAll();
		
	
	}
		
	@GetMapping(path="/employee/{empid}", produces={"application/json"})
	public Optional<Employee> getEmployee(@PathVariable int empid) 
	{
				
		return empdao.findById(empid);
		
	
	}
	
	@DeleteMapping(path="/employee/{empid}")
	public String deleteEmployee(@PathVariable int empid) 
	{
				
		Employee em =  empdao.getOne(empid);
		empdao.delete(em);
		return "Deleted";
		
	
	}
	
	@PutMapping("/employee/")
	public Employee saveOrUpdateEmployee(Employee emp) {
		
		empdao.save(emp);
		
		return emp;
	}
	
}
