package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.EmployeeDAOInterface;
//import com.dao.PhysicianDAOInterface;
import com.model.Employee;
//import com.model.Physician;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeServiceInterface {
	@Autowired
	EmployeeDAOInterface dao;

	public void saveEmployee(Employee employee) {
		dao.saveEmployee(employee);
	}

	public List<Employee> getUsers() {

		return dao.getUsers();
	}

}
