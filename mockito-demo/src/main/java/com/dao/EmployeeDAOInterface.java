package com.dao;

import java.util.List;

import com.model.Employee;


public interface EmployeeDAOInterface {
	
	List<Employee> getUsers();

	void saveEmployee(Employee employee);

}
