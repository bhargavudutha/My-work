package com.dao;

import java.util.List;
import java.util.Optional;

import com.model.User;

public interface UserDao {
	public abstract Optional<User> save(User user);

	public abstract Optional<User> findBy(Integer id);

	public abstract Optional<User> update(User user);

	public abstract List<User> findAll();

}
