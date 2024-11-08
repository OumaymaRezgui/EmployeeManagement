package com.cifop.tn.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cifop.tn.exception.BadRequestException;

@ControllerAdvice
public class CustomizedHandlerException {
	
	
	@ExceptionHandler(value = BadRequestException.class)
	public ResponseEntity<Object> badRequestException(BadRequestException badRequestException)
	{
		return new ResponseEntity<>(new ErrorResponse(new Date(),25,badRequestException.getMessage()),HttpStatus.BAD_REQUEST);
	}

}
