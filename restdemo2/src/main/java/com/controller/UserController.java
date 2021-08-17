package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exception.UserException;
import com.model.User;
import com.service.UserService;

@RestController
public class UserController {
	@Autowired
	private User user;
	@Autowired
	private UserService userService;
	@Autowired
	private UserException userException;

	@GetMapping(value = "getuser")
	public ResponseEntity<User> getUser() {
		User temp = userService.getUser();
		ResponseEntity responseEntity = null;
		if (temp != null) {
			responseEntity = new ResponseEntity(temp, HttpStatus.OK);
		} else {
			responseEntity = new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return responseEntity;
	}

	@GetMapping(value = "getname/{name}")
	public ResponseEntity<User> getUserByName(@PathVariable String name) throws UserException {
		ResponseEntity responseEntity = null;
		if (name.length() > 0) {
			User temp = userService.getUserByName(name);
			responseEntity = new ResponseEntity(temp, HttpStatus.OK);
		} else {
			responseEntity = new ResponseEntity(HttpStatus.NOT_FOUND);
		}

		return responseEntity;
	}

	@GetMapping(value = "getId/{id}")

	public ResponseEntity<User> getUserById(@PathVariable int id) throws UserException {

		ResponseEntity responseEntity = null;
		if (id > 0) {
			User temp = userService.getUserById(id);
			responseEntity = new ResponseEntity(temp, HttpStatus.OK);
		} else {
			responseEntity = new ResponseEntity(HttpStatus.NOT_FOUND);
		}

		return responseEntity;
	}

	@GetMapping(value = "getusers")

	public ResponseEntity<List<User>> getUsers() {
		List<User> users = userService.getUsers();
		ResponseEntity responseEntity = null;
		if (users != null) {
			responseEntity = new ResponseEntity(users, HttpStatus.OK);
		} else {
			responseEntity = new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return responseEntity;
	}

	@PostMapping(value = "addusers")

	public ResponseEntity<User> addUsers(@RequestBody User user) {
		User temp = userService.addUsers(user);
		return new ResponseEntity(temp, HttpStatus.OK);
	}

	@PutMapping(value = "updateuser")

	public ResponseEntity<User> updateUser(@RequestBody User user) {
		int temp = userService.updateUser(user);
		ResponseEntity responseEntity = null;
		if (temp > 0) {
			responseEntity = new ResponseEntity("Successfully updated", HttpStatus.OK);
		} else {
			responseEntity = new ResponseEntity("Reason:user not exists in database", HttpStatus.NOT_FOUND);
		}
		return responseEntity;
	}

	@DeleteMapping(value = "deleteuser/{id}")

	public ResponseEntity<User> deleteUser(@PathVariable int id) throws UserException {
		ResponseEntity responseEntity = null;
		int temp = userService.deleteUser(id);

		if (temp > 0) {
			responseEntity = new ResponseEntity("Successfully deleted", HttpStatus.OK);
		} else {
			responseEntity = new ResponseEntity("Reason:user not exists in database", HttpStatus.NOT_FOUND);
		}
		return responseEntity;
	}

}