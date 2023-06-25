package com.collection.list.comprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {

	int id;
	int marks;
	String name;

	public Student(int id, int marks, String name) {

		this.id = id;
		this.marks = marks;
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {

		//raj jay
		//ram ram == 0
		//return o.name.compareTo(name);
		return this.name.compareTo(o.name);
			

		// System.out.println("....");
//		if(o.marks>this.marks) {
//			
//			return 1;
//		}
//		else if(o.marks == this.marks) {
//			
//			return 0;
//		}
//		
//		else {
//			return -1;
//		}
	}

}

public class ComparableDemo {

	public static void main(String[] args) {

//		List<String> ls = new ArrayList<String>();
//		ls.add("java");
//		ls.add("python");
//		ls.add("cpp");
//		ls.add("php");
//
//		Collections.sort(ls);
//
//		for (String s : ls) {
//
//			System.out.println(s);
//		}

		List<Student> students = new ArrayList<Student>();
		students.add(new Student(101, 78, "raj"));
		students.add(new Student(102, 86, "jay"));
		students.add(new Student(103, 90, "parth"));
		students.add(new Student(104, 71, "neha"));

		Collections.sort(students);

		for (Student s : students) {
			System.out.println(s.id + " " + s.name + " " + s.marks);

		}

	}
}
