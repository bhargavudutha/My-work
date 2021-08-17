package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
//import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;

@RestController
public class FirstController {
	@RequestMapping(value = "one") // one is called as end point
	public String sayHello() {
		return "welcome to Spring REST";

	}

	@RequestMapping(value = "emp", method = RequestMethod.GET, produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE}) // or directly use GetMapping
	public Employee getEmployee() {
		return new Employee(10, "Bhargav", 22222.22f);

	}

	@RequestMapping(value = "emppath/{abc}", method = RequestMethod.GET) // or directly use GetMapping
	public Employee getEmployeeById(@PathVariable("abc") int arg) {
		Employee employee = null;
		if (arg == 20)
			 employee = new Employee(20, "Bhargav20", 22222.22f);
		if (arg == 30)
			employee = new Employee(30, "Bhargav30", 22222.22f);
		return employee;
	}

	@RequestMapping(value = "empall", method = RequestMethod.GET) // or directly use GetMapping
	public List<Employee> getAllEmployees() {
		Employee employee1 = new Employee(10, "Bhargav", 22222.22f);
		Employee employee2 = new Employee(20, "Pavan", 22222.22f);
		Employee employee3 = new Employee(30, "kalyan", 22222.22f);
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		return employees;

	}

	@RequestMapping(value = "empCreate", method = RequestMethod.POST)
	public Employee addEmployee(@RequestBody Employee employee) {
		System.out.println("server side emp id:" + employee.getEmpNo());
		System.out.println("server side emp id:" + employee.getEmpName());
		System.out.println("server side emp id:" + employee.getSalary());
		return employee;

	}

	@RequestMapping(value = "empUpdate", method = RequestMethod.PUT)
	public Employee updateEmployee(@RequestBody Employee employee) {
		System.out.println("server side update emp id:" + employee.getEmpNo());
		System.out.println("server side update emp name:" + employee.getEmpName());
		System.out.println("server side update emp salary:" + employee.getSalary());
		employee.setSalary(10000);
		return employee;

	}

	@RequestMapping(value = "empdelete/{abc}", method = RequestMethod.DELETE)
	public boolean deleteEmployeeById(@PathVariable("abc") int arg) {

		System.out.println("employee no" + arg + "is deleted");
		return true;

	}
}
