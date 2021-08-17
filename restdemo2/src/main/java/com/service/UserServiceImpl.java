package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDao;
import com.exception.UserException;
import com.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private UserException userException;

	@Override
	public User getUser() {

		User temp = userDao.getUser();
		return temp;
	}

	@Override
	public User getUserByName(String name) throws UserException {
		User temp = userDao.getUserByName(name);
		return temp;
	}

	@Override
	public User getUserById(int id) throws UserException {
		User temp = userDao.getUserById(id);
		return temp;
	}

	@Override
	public List<User> getUsers() {
		List<User> temp = userDao.getUsers();
		return temp;

	}

	@Override
	public User addUsers(User user) {
		User temp = userDao.addUsers(user);
		return temp;
	}

	@Override
	public int updateUser(User user) {
		int temp = userDao.updateUser(user);
		return temp;

	}

	@Override
	public int deleteUser(int id) throws UserException{
		int temp = userDao.deleteUser(id);
		return temp;

	}

}
