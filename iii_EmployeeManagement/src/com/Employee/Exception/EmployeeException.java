package com.Employee.Exception;

public class EmployeeException extends Exception {
	
	String msg;

	public EmployeeException(String msg) {
		super();
		System.out.println("Invalid input:"+ msg);
	}

}
