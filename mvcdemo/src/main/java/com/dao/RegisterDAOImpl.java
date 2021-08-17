package com.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.model.Register;


@Repository
public class RegisterDAOImpl implements RegisterDAOInterface{

	

	/*@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void saveRegister(Register register) {
		1st method-----------
		
		java.sql.Date sqlDate = new java.sql.Date(register.getDob().getTime());
		
		2nd method
		
		 using temporal annotation define in register.pojo file
		jdbcTemplate.update("insert into register values ('"+register.getUsername()+"','"+register.getPassword()+"','"+register.getLanguages()+"','"+register.getGender()+"','"+register.getCountry()+"','"+sqlDate+"')");
		
	}*/
	
	
	/* connect spring with hibernate------------------*/
	
	@Autowired
	SessionFactory sessionFactory;
	
	public void saveRegister(Register register) {
		
		sessionFactory.openSession().save(register);
		
	}

	public List<Register> getUsers() {
		List<Register> ls=sessionFactory.openSession().createQuery("from Register").list();
		
		return ls;
	}

}
