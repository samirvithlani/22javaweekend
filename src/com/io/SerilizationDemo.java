package com.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	
	int id;
	String name;
	public Student(int id, String name) {
	
		this.id = id;
		this.name = name;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
}
public class SerilizationDemo {

	public static void main(String[] args) {

		Student s1 = new Student(101,"raj");
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.txt"));
			out.writeObject(s1);
			System.out.println("serilize done..");
			out.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
