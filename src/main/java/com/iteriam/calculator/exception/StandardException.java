package com.iteriam.calculator.exception;

import com.iteriam.calculator.enums.ErrorCode;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode(callSuper=true)
@Data
public class StandardException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2843685359958058920L;
	
	private final ErrorCode error;

}
