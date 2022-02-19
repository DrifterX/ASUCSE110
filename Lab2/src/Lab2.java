/*------------------------------------------------------------- 
// AUTHOR: Nic Holmes
// FILENAME: Lab2.java 
// SPECIFICATION: Read a first and last name input and reprint with full capitalization as well as the number of characters in the two names 
// FOR: CSE 110 - Lab #2 
// TIME SPENT: 15 minutes  
//-----------------------------------------------------------*/

import java.util.Scanner;


public class Lab2 {
	public static void main(String[] args) {
		//declaring variables
		String fName, lName, fullName;
		int nameLength;
		Scanner scan = new Scanner(System.in);
		
		//Read first and last name after prompt
		System.out.println("Please enter your first name:");
		fName = scan.nextLine();
		System.out.println("Please enter your last name:");
		lName = scan.nextLine();
		
		//Creating full name
		fullName = fName + " " + lName;
		System.out.println("Full name (in capitals): " + fullName.toUpperCase());
		nameLength = fullName.length();
		System.out.println("Length of full name: " + nameLength);
		
		String comparisonOperatorString = new String("Oogabooga");
		String secondCompareString = "Oogabooga";
		
		if( comparisonOperatorString == secondCompareString) {
			System.out.println("The == works!");
		}
		else {
			System.out.println("The == didn't work... :(");
		}
		
		if(comparisonOperatorString.equals(secondCompareString)) {
			System.out.println("The .equals() method works!");
		}
		else {
			System.out.println("The .equals() method didn't work... ");
		}
	
		scan.close();
	}
}
