package com.service;

import java.util.List;

import com.model.Register;

public interface RegisterServiceInterface {

	void saveRegister(Register register);

	List<Register> getUsers();

}
