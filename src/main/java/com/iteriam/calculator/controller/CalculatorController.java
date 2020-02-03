package com.iteriam.calculator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iteriam.calculator.request.BasicOperationRequest;
import com.iteriam.calculator.response.BasicOperationResponse;

import io.swagger.annotations.ApiModel;

@RestController
@ApiModel(value = "Calculator", description = "Controller for a basic calculator")
public class CalculatorController {

	@GetMapping(path = "basicOperation", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<BasicOperationResponse> basicOperation(BasicOperationRequest boReq) {

		BasicOperationResponse boRes = new BasicOperationResponse();
		boRes.setResult(1000); // AN EXAMPLE FOR NOW

		return new ResponseEntity<>(boRes, HttpStatus.OK);
	}

}
