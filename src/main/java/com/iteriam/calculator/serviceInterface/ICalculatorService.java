package com.iteriam.calculator.serviceInterface;

import com.iteriam.calculator.request.BasicOperationRequest;
import com.iteriam.calculator.response.BasicOperationResponse;

public interface ICalculatorService {

	public BasicOperationResponse basicOperation(BasicOperationRequest boReq);

}
