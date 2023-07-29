package com.collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Users implements Comparable<Users> {

	int uId;
	String uName;
	int uAge;

	public Users(int uId, String uName, int uAge) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.uAge = uAge;
	}

	@Override
	public int compareTo(Users o) {

//		return this.uName.compareTo(o.uName);
		if(this.uAge>o.uAge) {
			return 1;
		}
		else if(this.uAge == o.uAge) {
			return 0;
		}
		
		return -1;
	}

}

public class HashMapComparable {

	public static void main(String[] args) {

		List<Users> userList = new ArrayList<Users>();
		userList.add(new Users(101, "raj", 23));
		userList.add(new Users(103, "ajay", 21));
		userList.add(new Users(104, "neha", 22));
		userList.add(new Users(105, "parth", 29));
		userList.add(new Users(107, "pratik", 30));
		
		Collections.sort(userList);
		
		for(Users u: userList) {
			
			System.out.println(u.uId + " "+u.uName + " "+u.uAge);
		}

	}
}
