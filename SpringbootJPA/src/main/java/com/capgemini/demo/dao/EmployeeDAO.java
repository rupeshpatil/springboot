package com.capgemini.demo.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.capgemini.demo.model.Employee;


import java.util.List;


public interface EmployeeDAO extends CrudRepository<Employee, Integer>
{
	/*To fetch value from database you have write query this way.
	 * FindByGender - FindBy should be our syntax and last should be attribute(gender) of table.
	 * */
	List<Employee> findByGender(String gender);
	/*Write custom query*/
	
	@Query("from Employee where gender=?1 order by empname")
	List<Employee> findByGenderSorted(String gender);
}
