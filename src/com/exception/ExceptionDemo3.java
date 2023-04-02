package com.exception;

public class ExceptionDemo3 {

	public static void main(String[] args) {

		try {
			int arr[] = new int[5];

			// System.out.println(arr[6]); //arrayIndexOutOfboud
			arr = null;
			System.out.println(arr[0]); // null pointer

		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) {

			System.out.println("internal server error...");
		}
//		}catch (NullPointerException e) {
//			System.out.println("object is nulll");
//		}
//		catch (ArrayIndexOutOfBoundsException e) {
//			
//			System.out.println("pls check array size...");
//		}
	}
}
