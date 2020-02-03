package com.iteriam.calculator.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class BasicOperationResponse {

	@ApiModelProperty(value = "Result of the operation")
	double result;

}
