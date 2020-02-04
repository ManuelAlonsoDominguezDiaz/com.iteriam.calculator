package com.iteriam.calculator.serviceImpl;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.iteriam.calculator.enums.BasicOperationEnum;
import com.iteriam.calculator.enums.ErrorCode;
import com.iteriam.calculator.exception.StandardException;
import com.iteriam.calculator.request.BasicOperationRequest;
import com.iteriam.calculator.response.BasicOperationResponse;
import com.iteriam.calculator.serviceInterface.ICalculatorService;

@Service
public class CalculatorServiceImpl implements ICalculatorService {

	public BasicOperationResponse basicOperation(BasicOperationRequest boReq) {

		BasicOperationResponse boRes = new BasicOperationResponse();

		double result = Arrays.stream(BasicOperationEnum.values())
				.filter(op -> op.getOperationSymbol().equals(boReq.getSymbol())).findFirst()
				.orElseThrow(() -> new StandardException(ErrorCode.OPERATOR_NOT_FOUND)).getOperationResult(boReq.getOp1(), boReq.getOp2());

		boRes.setResult(result);

		return boRes;
	}

}
