package com.oops.inheritance;


class Country{
	
	int fund = 20;
}
class State extends Country{
	
	int grant = 25000;
	
	public int giveGrant() {
		
		return grant * fund;
	}
	
}


public class City extends State{

	
	public void fetchMoney() {
		
		System.out.println(fund);
		int x = giveGrant();
		System.out.println("grant from state..."+x);
	}
	
	public static void main(String[] args) {
		
		
		City c = new City();
		c.fetchMoney();
		
		
	}
}

