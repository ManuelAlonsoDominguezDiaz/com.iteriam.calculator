package com.iteriam.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iteriam.calculator.request.BasicOperationRequest;
import com.iteriam.calculator.response.BasicOperationResponse;
import com.iteriam.calculator.serviceImpl.CalculatorServiceImpl;

import io.swagger.annotations.ApiModel;

@RestController
@ApiModel(value = "Calculator", description = "Controller for a basic calculator")
public class CalculatorController {

	@Autowired
	CalculatorServiceImpl calculatorServiceImpl;

	@GetMapping(path = "basicOperation", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<BasicOperationResponse> basicOperation(BasicOperationRequest boReq) {
		return new ResponseEntity<>(calculatorServiceImpl.basicOperation(boReq), HttpStatus.OK);
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<IllegalArgumentException> illegalArgumentHandler() {
		// TODO return a custom exception with only the necessary data to the client
		return new ResponseEntity<>(new IllegalArgumentException(), HttpStatus.BAD_REQUEST);
    }

}
