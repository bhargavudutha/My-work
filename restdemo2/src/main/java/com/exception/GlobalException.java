package com.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.model.User;

@ControllerAdvice
public class GlobalException extends Exception {

	@ExceptionHandler({ UserException.class, NullPointerException.class })
	public ResponseEntity<User> processException(Exception exception) {
		return new ResponseEntity(exception.getMessage(), HttpStatus.NOT_FOUND);

	}

}