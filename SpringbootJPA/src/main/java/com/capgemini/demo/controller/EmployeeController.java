package com.capgemini.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.demo.dao.EmployeeDAO;
import com.capgemini.demo.model.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDAO empdao;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addEmployee")
	public String addEmployee(Employee emp) {
		
		empdao.save(emp);
		
		return "home.jsp";
	}
	
	@RequestMapping("/getEmployee")
	public ModelAndView getEmployee(@RequestParam int empid) {
		
		ModelAndView mv= new ModelAndView("showEmployee.jsp");
		
		/*We can write query like below example*/
		System.out.println(empdao.findByGender("male"));
		System.out.println(empdao.findByGenderSorted("male"));
		
		
		/** Below code is returning value by id */
			
		Employee employee = new Employee();
		
		employee = empdao.findById(empid).orElse(employee);
		mv.addObject(employee);
		
		return mv;
	}
}
