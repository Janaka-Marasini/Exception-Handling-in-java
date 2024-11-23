package com.lab.two;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			int result = 100 / 0;
		} catch (ArithmeticException ex) {
		System.out.println(ex.toString());

		}

	}

}
