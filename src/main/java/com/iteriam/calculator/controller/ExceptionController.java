package com.iteriam.calculator.controller;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.iteriam.calculator.enums.ErrorCode;
import com.iteriam.calculator.exception.StandardException;
import com.iteriam.calculator.response.ErrorResponse;

import io.corp.calculator.TracerImpl;


@ControllerAdvice
public class ExceptionController {

	 TracerImpl trace = new TracerImpl();
	
	@ExceptionHandler(StandardException.class)
	public ResponseEntity<ErrorResponse> standardExceptionHandler(StandardException ex, WebRequest webReq) {

		ErrorResponse errRes = new ErrorResponse(ex.getError().getCode(), ex.getError().getMessage(),
				ex.getError().getHttpStatus(), new Date(), webReq.getDescription(true));

		trace.trace(ex.getError().getMessage());

		return new ResponseEntity<>(errRes, ex.getError().getHttpStatus());
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> exceptionHandler(Exception ex, WebRequest webReq) {

		ErrorResponse errRes = new ErrorResponse(ErrorCode.GENERIC_EXCEPTION.getCode(),
				ErrorCode.GENERIC_EXCEPTION.getMessage(), ErrorCode.GENERIC_EXCEPTION.getHttpStatus(), new Date(),
				webReq.getDescription(true));

		trace.trace(ex.getMessage());

		return new ResponseEntity<>(errRes, ErrorCode.GENERIC_EXCEPTION.getHttpStatus());
	}

}
