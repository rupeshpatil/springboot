package com.capgemini.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capgemini.demo.dao.EmployeeDAO;

@SpringBootApplication
public class SpringBootJdbcApplication implements CommandLineRunner {
	
	@Autowired
	private EmployeeDAO employeeDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	

}
