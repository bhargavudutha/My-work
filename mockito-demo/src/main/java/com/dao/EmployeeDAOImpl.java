package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAOInterface {
	@Autowired
	SessionFactory sessionFactory;
	public void saveEmployee(Employee employee) {
		sessionFactory.openSession().save(employee);
		

	}
	public List<Employee> getUsers() {
		List<Employee> ls=sessionFactory.openSession().createQuery("from Employee").list();
		
		return ls;
	
	}


}
