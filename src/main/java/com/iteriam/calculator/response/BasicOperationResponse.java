package com.iteriam.calculator.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasicOperationResponse {

	@ApiModelProperty(value = "Result of the operation")
	double result;

}
