package com.iteriam.calculator.response;

import java.util.Date;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class ErrorResponse {

	@NonNull
	String errorCode;
	
	@NonNull
	String errorMessage;
	
	@NonNull
	HttpStatus httpStatus;
	
	@NonNull
	Date errorDate;
	
	@NonNull
	String path;

}
