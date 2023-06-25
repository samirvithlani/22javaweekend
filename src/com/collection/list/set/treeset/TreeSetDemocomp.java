package com.collection.list.set.treeset;

import java.util.TreeSet;

class User implements Comparable<User>{
	
	int id;
	String name;
	public User(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
				
}
public class TreeSetDemocomp {

	
	public static void main(String[] args) {
		
		TreeSet<User> ts = new TreeSet<User>();
		ts.add(new User(1, "amit"));
		ts.add(new User(2, "priya"));
		ts.add(new User(3, "neha"));
		
		
		for(User u:ts) {
			
			System.out.println(u.id +" "+u.name);
		}
		
		
		
	}
	
}
