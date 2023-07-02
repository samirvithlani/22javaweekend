package com.collection.list.comprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Students implements Comparable<Students> {

	public Students(int id, String name) {

		this.id = id;
		this.name = name;
	}

	int id;
	String name;

	@Override
	// merge sort..
	public int compareTo(Students o) {

		// return this.name.compareTo(o.name);
		// return o.name.compareTo(this.name);
		if (this.id < o.id) {
			return 1;
		} else if (this.id == o.id) {
			return 1;
		}
		return -1;
	}

}

public class Comparable3 {

	public static void main(String[] args) {

		List<Students> students = new ArrayList<Students>();

		students.add(new Students(101, "raj"));
		students.add(new Students(102, "jay"));
		students.add(new Students(103, "parth"));

		Collections.sort(students);

		for (Students s : students) {

			System.out.println(s.id + " " + s.name);
		}

	}
}
