package com.lambda;


interface Calc{
	
	public void data(int x,int y,float z);
}
public class LambdaDemo4 {

	public static void main(String[] args) {
		
		
		Calc c =(x,y,z)->{
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			
		};
		c.data(100, 200, 20.25f);
	}
}
