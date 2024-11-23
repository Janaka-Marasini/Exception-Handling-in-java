package com.labtwo;

public class TestCustomException {
	public void validate(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("you cannot vote");
		}else
			System.out.println("vote the best");
	}

	public static void main(String[] args) {
		TestCustomException obj=new TestCustomException();
		try {obj.validate(10);
	}
		catch(InvalidAgeException e) {
			System.out.println("InvalidAgeException Caught");
			e.getMessage();
		}

}
}