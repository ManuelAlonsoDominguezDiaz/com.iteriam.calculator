package com.iteriam.calculator.controller;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.iteriam.calculator.enums.ErrorCode;
import com.iteriam.calculator.exception.StandardException;
import com.iteriam.calculator.response.ErrorResponse;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(StandardException.class)
	public ResponseEntity<ErrorResponse> standardExceptionHandler(StandardException e, WebRequest webReq) {

		ErrorResponse errRes = new ErrorResponse(e.getError().getCode(), e.getError().getMessage(),
				e.getError().getHttpStatus(), new Date(), webReq.getDescription(true));

		// TODO SET ERROR TRACE HERE

		return new ResponseEntity<>(errRes, e.getError().getHttpStatus());
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> exceptionHandler(WebRequest webReq) {

		ErrorResponse errRes = new ErrorResponse(ErrorCode.GENERIC_EXCEPTION.getCode(),
				ErrorCode.GENERIC_EXCEPTION.getMessage(), ErrorCode.GENERIC_EXCEPTION.getHttpStatus(), new Date(),
				webReq.getDescription(true));

		// TODO SET ERROR TRACE HERE

		return new ResponseEntity<>(errRes, ErrorCode.GENERIC_EXCEPTION.getHttpStatus());
	}

}
