package com.iteriam.calculator.serviceImpl;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.iteriam.calculator.request.BasicOperationRequest;
import com.iteriam.calculator.response.BasicOperationResponse;
import com.iteriam.calculator.serviceInterface.ICalculatorService;
import com.iteriam.enums.BasicOperationEnum;

@Service
public class CalculatorServiceImpl implements ICalculatorService {

	public BasicOperationResponse basicOperation(BasicOperationRequest boReq) {

		BasicOperationResponse boRes = new BasicOperationResponse();

		double result = Arrays.stream(BasicOperationEnum.values())
				.filter(op -> op.getOperationSymbol().equals(boReq.getOperator())).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Invalid Operator.")).getOperationResult(boReq.getOp1(), boReq.getOp2());

		boRes.setResult(result);

		return boRes;
	}

}
