package com.throwdemo;

public class LetMeThrow {
	public void amIGood(int guessnumber) throws ArithmeticException, ClassNotFoundException {
		if (guessnumber==9) {
			throw new ArithmeticException();
		}
		else
			throw new ClassNotFoundException("this is random example");
	}

	public static void main(String[] args) {
		LetMeThrow letMeThrowObject = new LetMeThrow();
		
		try {
			letMeThrowObject.amIGood(10);
			
		}catch(ArithmeticException | ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Exception caught here");
		}

	}

}
