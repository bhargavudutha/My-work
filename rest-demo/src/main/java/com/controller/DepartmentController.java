package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.model.Department;
import com.model.Employee;

@RestController
public class DepartmentController {
	@GetMapping(value="dept/{alias}")
	public Department getDepartmentById(@PathVariable("alias") int deptId)
	{
		Department department=new Department();
		if(deptId==100)
		{
			department.setDeptNo(100);
			department.setDeptName("Development");
			Employee employee=new Employee(123,"One23",123.45f);
			department.setEmployee(employee);
		}
		if(deptId==200)
		{
			department.setDeptNo(200);
			department.setDeptName("Development");
			Employee employee=new Employee(456,"Four56",123.45f);
			department.setEmployee(employee);
		}
		return department;
	}

}
