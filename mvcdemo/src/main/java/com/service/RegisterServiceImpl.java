package com.service;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.RegisterDAOInterface;
import com.model.Register;

@Service
@Transactional
public class RegisterServiceImpl implements RegisterServiceInterface{

	@Autowired
	RegisterDAOInterface dao;
	
	public void saveRegister(Register register) {
		
		
		dao.saveRegister(register);
	}
	public List<Register> getUsers() {
		
		return dao.getUsers();
	}

}
