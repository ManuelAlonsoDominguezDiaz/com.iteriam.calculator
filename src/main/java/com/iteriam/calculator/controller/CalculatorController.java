package com.iteriam.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iteriam.calculator.request.BasicOperationRequest;
import com.iteriam.calculator.response.BasicOperationResponse;
import com.iteriam.calculator.serviceImpl.CalculatorServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;

@Api(tags = {"calculator"})
@RestController
@ApiModel(value = "Calculator", description = "Controller for a basic calculator")
@RequestMapping("/calculator")
public class CalculatorController {

	@Autowired
	CalculatorServiceImpl calculatorServiceImpl;

	@GetMapping(path = "/basicOperation", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<BasicOperationResponse> basicOperation(BasicOperationRequest boReq) {
		return new ResponseEntity<>(calculatorServiceImpl.basicOperation(boReq), HttpStatus.OK);
	}
	
}
