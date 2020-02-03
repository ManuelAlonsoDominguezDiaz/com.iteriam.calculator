package com.iteriam.calculator.response;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponse {

	String error;
	Date date;
	int status;

}
