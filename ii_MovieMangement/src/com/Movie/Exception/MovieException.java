package com.Movie.Exception;

/*
 * User defined exception for error handling
 * throws
 */

public class MovieException extends Exception{
	
	String msg;

	public MovieException(String msg) {
		super();
		System.out.println("Invalid Input: " + msg);
	}

}
