package com.task;

import java.util.Scanner;

//1 flat/unit --> 1000 sq feet
//min 20 flats  -->
//1 floor 4
//no of floors 5
//garden --> 10 % of total land...

class BobBuilder {

	//
	double landSpace;
	// min 10
	double rowHouseCount;
	double minLandSpace;
	int builtRowHouse;
	int parking;
	double gardenSpace;
	int perRowHouse;

}

public class Task2 extends BobBuilder {

	public Task2() {
		minLandSpace = 1200;
		rowHouseCount =10;
		perRowHouse = 1200;
	}

	public void makeRowHoueses() {

					//10 * 1200
		minLandSpace = rowHouseCount * minLandSpace;
		System.out.println("min landspace..."+minLandSpace);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter land area :");
		landSpace = sc.nextDouble();
		System.out.println("landspace"+landSpace);
		if (landSpace < minLandSpace) {
			System.out.println("please enter valid land space...");
		} else {

			System.out.println("No of row house can built...");
						
			builtRowHouse =(int) (landSpace/perRowHouse);
			
			System.out.println(builtRowHouse + "..can built");
			parking = builtRowHouse;
			System.out.println("no of parking can be built " + parking);
					
			gardenSpace = landSpace % perRowHouse;
			System.out.println("gardenspace" + gardenSpace);

		}

	}

	public static void main(String[] args) {

		Task2 t = new Task2();
		t.makeRowHoueses();

	}
}
