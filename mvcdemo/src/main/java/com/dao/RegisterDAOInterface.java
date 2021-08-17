package com.dao;

import java.util.List;

import com.model.Register;

public interface RegisterDAOInterface {

	void saveRegister(Register register);

	List<Register> getUsers();

}
