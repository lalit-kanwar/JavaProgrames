package com.java.HackerRankPrograme;

public class DivideByTwoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	DivideByTwoException() {
		super();

		System.out.println("DivideByTwoException raised");
	}

	DivideByTwoException(String msg) {
		super(msg);
		System.out.println(msg + " : DivideByTwoException is Raised");
	}

}
