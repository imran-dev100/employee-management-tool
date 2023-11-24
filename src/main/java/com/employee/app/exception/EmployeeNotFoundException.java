package com.employee.app.exception;

public class EmployeeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 335477230763683868L;

	public EmployeeNotFoundException() {
		super();
	}

	public EmployeeNotFoundException(final String message) {
		super(message);
	}
}
