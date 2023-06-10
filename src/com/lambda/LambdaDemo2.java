package com.lambda;

interface Cloud{
	
	public int sum(int a,int b);
}

public class LambdaDemo2 {

	
	public static void main(String[] args) {
		
		
		Cloud c = (a,b)->{
			
			return a +b;
		};
		int ans = c.sum(12, 22);
		System.out.println(ans);
	}
}
