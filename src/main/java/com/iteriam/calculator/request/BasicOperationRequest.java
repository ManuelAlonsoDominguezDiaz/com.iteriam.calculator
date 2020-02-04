package com.iteriam.calculator.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BasicOperationRequest {

	@ApiModelProperty(value = "Left operand", example = "5")
	double op1;

	@ApiModelProperty(value = "Right operand", example = "10")
	double op2;

	@ApiModelProperty(allowableValues = "+,-", example = "+")
	Character symbol;

}
