package com.tata;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	public Employee(int id, String name) {
	
		this.id = id;
		this.name = name;
	}
			
}
public class SerDemo {

	
	public static void main(String[] args) {
	
		Employee e1 = new Employee(101, "raj");
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("emp.ser"));
			out.writeObject(e1);
			System.out.println("object has been serilized....");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
	}
}
