package com.collection.list.arraylist;

import java.util.ArrayList;
import java.util.List;

class Students{
	
	int sId;
	String sName;
	public Students(int sId, String sName) {
	
		this.sId = sId;
		this.sName = sName;
	}
	
}

public class StudentList {

	public static void main(String[] args) {
		
		
		List<Students> students = new ArrayList<Students>();
		Students s1 = new Students(101, "amit");
		Students s2 = new Students(102, "raj");
		Students s3 = new Students(103, "parth");
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		
		for(Students s: students) {
			System.out.println(s.sId+" "+s.sName);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
