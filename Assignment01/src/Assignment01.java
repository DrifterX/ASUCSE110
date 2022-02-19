/*------------------------------------------------------------- 
// AUTHOR: Nic Holmes
// FILENAME: Assignment01.java 
// SPECIFICATION: Read inputs about pizza and print out facts about them. 
// FOR: CSE 110 - Assignment #01 
// TIME SPENT: 15 minutes  
//-----------------------------------------------------------*/

import java.util.Scanner;
public class Assignment01 {
	public static void main(String[] args) {
		//creating variables
		int numOfPizzas, numSlicesPerPizza, numAdults, numChildren, numTotalSlices, remainderSlices, numAdultSlices, numSlicesForKids;
		int numSlicesPerKid;
		final int SLICES_PER_ADULT = 2;
		Scanner scan = new Scanner(System.in);
		
		//Collecting data
		System.out.print("Number of pizzas purchased : ");
		numOfPizzas = scan.nextInt();
		System.out.print("Number of slices per pizza : ");
		numSlicesPerPizza = scan.nextInt();
		System.out.print("Number of adults           : ");
		numAdults = scan.nextInt();
		System.out.print("Number of children         : ");
		numChildren = scan.nextInt();
		
		//Doing math operations
		numTotalSlices = numOfPizzas * numSlicesPerPizza;
		numAdultSlices = numAdults * SLICES_PER_ADULT;
		numSlicesForKids = numTotalSlices - numAdultSlices;
		numSlicesPerKid = numSlicesForKids / numChildren;
		remainderSlices = (numSlicesForKids % numChildren);
		
		//printing required information
		System.out.printf("%-46s", "Total number of slices of pizza");
		System.out.printf(": " + numTotalSlices + "%n");
		System.out.printf("%-46s", "Total number of slices given to adults");
		System.out.printf(": " + numAdultSlices + "%n");
		System.out.printf("%-46s %n", "Total number of slices available for children : " + numSlicesForKids);
		System.out.printf("%-46s", "Number of slices each child will get");
		System.out.printf(": " + numSlicesPerKid + "%n");
		System.out.printf("%-46s", "Number of slices left over");
		System.out.printf(": " + remainderSlices);
		
		scan.close();
	}
}
