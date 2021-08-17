package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Register;
import com.service.RegisterServiceImpl;
import com.service.RegisterServiceInterface;

@Controller
public class RegisterController {
	
	@Autowired
	RegisterServiceInterface service;
	
	@RequestMapping("/register")
	public ModelAndView registerPage(@ModelAttribute("register") Register register) {
	
		return new ModelAndView("register");  // name of jsp
	}
	
	@RequestMapping("/saveRegister")
	public ModelAndView saveRegisterPage(@ Validated @ModelAttribute("register") Register register,BindingResult result) {     
		/*@valid or @validator is same*/
	
		if(result.hasErrors()) {
			return new ModelAndView("register");
		}
		else {
			
			service.saveRegister(register);
			return new ModelAndView("redirect:home");  // name of jsp
		}
		
	}
}
