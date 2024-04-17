package com.employee.app.exception;

import jakarta.persistence.EntityNotFoundException;

public class EmployeeNotFoundException extends EntityNotFoundException {
	private static final long serialVersionUID = 335477230763683868L;
	
	public EmployeeNotFoundException() {
		super();
	}
	public EmployeeNotFoundException(final String message) {
		super(message);
	}
}
