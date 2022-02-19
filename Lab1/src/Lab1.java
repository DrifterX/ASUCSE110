/*------------------------------------------------------------ 
// AUTHOR: Nic Holmes
// FILENAME: Lab1
// SPECIFICATION: Find the average of three test scores
// FOR: CSE 110- Lab #1 
// TIME SPENT: 30 minutes //--------------------
---------------------------------------*/

import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args) {
		//creating Scanner
		Scanner in = new Scanner(System.in);
		
		//declaring variables
		int firstTest, secondTest, thirdTest;
		final int NUM_TESTS = 3;
		double averageGrade;
		String blah = "stuff";
		boolean token = false;
		
		/*/collecting input scores
		System.out.print("Enter the score on the first test:");
		firstTest = in.nextInt();
		System.out.print("Enter the score on the second test:");
		secondTest = in.nextInt();
		System.out.print("Enter the score on the third test:");
		thirdTest = in.nextInt();
		*/
		//determining the average
		//averageGrade = (firstTest + secondTest + thirdTest) / (double) NUM_TESTS;
		for(int i = 0; i < 6; i++) {
			System.out.println("token is" + i);
		}
		
		
		//Closing scanner
		in.close();
	}
}
