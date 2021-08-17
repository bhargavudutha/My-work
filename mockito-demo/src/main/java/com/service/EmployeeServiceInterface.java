package com.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeServiceInterface {
	void saveEmployee(Employee employee);

	List<Employee> getUsers();

}
