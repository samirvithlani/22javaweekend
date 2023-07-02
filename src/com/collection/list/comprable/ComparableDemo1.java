package com.collection.list.comprable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("python");
		list.add("php");
		list.add("node");
		list.add("ds");

		Collections.sort(list);

		for (String s : list) {

			System.out.println(s);
		}

	}
}
