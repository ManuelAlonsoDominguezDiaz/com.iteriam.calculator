package com.iteriam.calculator.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.iteriam.calculator.exception.StandardException;
import com.iteriam.calculator.request.BasicOperationRequest;
import com.iteriam.calculator.response.BasicOperationResponse;
import com.iteriam.calculator.serviceImpl.CalculatorServiceImpl;

public class CalculatorServiceTest {

	private final CalculatorServiceImpl calculatorServiceImpl = new CalculatorServiceImpl();

	@DisplayName("Testing a successful Addition")
	@Test
	void testSuccessfulAddition() {

		BasicOperationRequest boReq = new BasicOperationRequest(1000, 2000, '+');

		assertEquals(new BasicOperationResponse(3000), calculatorServiceImpl.basicOperation(boReq));
	}
	
	@DisplayName("Testing a successful substraction")
	@Test
	void testSuccessfulSubstraction() {

		BasicOperationRequest boReq = new BasicOperationRequest(10, 4, '-');

		assertEquals(new BasicOperationResponse(6), calculatorServiceImpl.basicOperation(boReq));
	}

	@DisplayName("Invalid Operator")
	@Test
	void testInvalidOperator() {

		BasicOperationRequest boReq = new BasicOperationRequest(1, 1, '&');

		assertThrows(StandardException.class, () -> calculatorServiceImpl.basicOperation(boReq),
				"INVALID OPERATOR");
	}

}
