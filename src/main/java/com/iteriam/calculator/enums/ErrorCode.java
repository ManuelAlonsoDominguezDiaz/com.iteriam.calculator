package com.iteriam.calculator.enums;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
public enum ErrorCode {

	GENERIC_EXCEPTION("000-000", "Internal server error", HttpStatus.INTERNAL_SERVER_ERROR),
	OPERATOR_NOT_FOUND("001-001", "Invalid operator.", HttpStatus.BAD_REQUEST);

	private final @NonNull String code;
	private final @NonNull String message;
	private final @NonNull HttpStatus httpStatus;

	public String getMessage() {
		return this.message;
	}

	public String getCode() {
		return this.code;
	}

	public HttpStatus getHttpStatus() {
		return this.httpStatus;
	}

}
