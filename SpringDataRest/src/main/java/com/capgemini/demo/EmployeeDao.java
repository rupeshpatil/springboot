package com.capgemini.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.capgemini.demo.model.Employee;

@RepositoryRestResource(collectionResourceRel = "emloyees", path="employees")
public interface EmployeeDao extends JpaRepository<Employee, Integer>
{

}
