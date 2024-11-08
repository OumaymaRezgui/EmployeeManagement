package com.cifop.tn.exception;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorResponse {
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private Date timestamp;
	@JsonProperty("code")
	private int code;
	@JsonProperty("message")
	private String message;
	public ErrorResponse(Date date, int code, String message) {
		this.timestamp = date;
		this.code = code;
		this.message = message;
	}
	
}