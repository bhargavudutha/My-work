package com.dao;

import java.util.List;

import com.exception.UserException;
import com.model.User;

public interface UserDao {

	User getUser();

	User getUserByName(String name) throws UserException;

	User getUserById(int id) throws UserException;

	List<User> getUsers();

	User addUsers(User user);

	int updateUser(User user);


	int deleteUser(int id) throws UserException;


	
}