package com.exception;

public class CustomeException {

	public void checkAge(int age) throws InvalidAgeException {

		if (age < 18) {

			throw new InvalidAgeException("age is not valid...");
		} else {
			System.out.println(age);
		}

	}

	public static void main(String[] args) {

		CustomeException c = new CustomeException();
		int age = 17;
		try {
			c.checkAge(age);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			System.out.println("enter valid age....");
		}
	}

}
