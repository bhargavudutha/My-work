package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.model.Employee;
import com.service.EmployeeServiceInterface;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeServiceInterface service;
	
	/*@RequestMapping("/register")
	public ModelAndView registerPage(@ModelAttribute("register") Register register) {
	
		return new ModelAndView("register");  // name of jsp
	}
	
	@RequestMapping("/saveRegister")
	public ModelAndView saveRegisterPage(@ Validated @ModelAttribute("register") Register register,BindingResult result) {     
		/*@valid or @validator is same*/
	
		/*if(result.hasErrors()) {
			return new ModelAndView("register");
		}
		else {
			
			service.saveRegister(register);
			return new ModelAndView("redirect:home");  // name of jsp
		}*/
	
	
	//-----To Save-----
	@PostMapping("saveEmployee")
	//@RequestMapping(value="saveRegister",method=RequestMethod.POST)
	public Employee saveEmployee (@RequestBody Employee employee ) {
		service.saveEmployee (employee);
		return employee ;
	}
	
	//----To fetch(select)---
	    //@ResponseBody
		//@RequestMapping(value="fetchUsers", method=RequestMethod.GET)
	    @GetMapping("fetchUsers")
	    public List<Employee > getUsers()
	    {
	        List<Employee >ls=service.getUsers();
	        return ls;
	    } 
	    
	    
	    
		
	}


	
	
