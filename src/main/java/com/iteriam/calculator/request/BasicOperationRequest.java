package com.iteriam.calculator.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class BasicOperationRequest {

	@ApiModelProperty(value = "Left operator", example = "5")
	double op1;

	@ApiModelProperty(value = "Right operator", example = "10")
	double op2;

	@ApiModelProperty(allowableValues = "+,-,/", example = "+")
	Character operator;

}
