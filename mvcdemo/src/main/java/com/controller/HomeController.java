package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Register;
import com.service.RegisterServiceInterface;

@Controller
public class HomeController {
	
	@Autowired
	RegisterServiceInterface service;
	
	@RequestMapping( value="home")
	public ModelAndView getUsers() {
		List<Register> list = service.getUsers();
		return new ModelAndView("home","listOfUsers",list);  // name of jsp
	}
}
