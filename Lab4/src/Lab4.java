/*-------------------------------------------------------------
// AUTHOR: Nic Holmes
// FILENAME: Lab4.java
// SPECIFICATION: Basic calculator
// FOR: CSE 110- Lab #4
// TIME SPENT: 30 minutes.
//-----------------------------------------------------------*/

// Import Scanner class
import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {

    	// Declare some variables you need
        int userMenuChoice, numToOperateWith, finalNumberToPrint;
        Scanner input = new Scanner(System.in);

        do {
            // Display the menu
            displayMenu();

            // Ask the user for one option
            userMenuChoice = input.nextInt();
            if(userMenuChoice != 4) {
            	System.out.print("Enter a number:\n");
                numToOperateWith = input.nextInt();

                switch (userMenuChoice) {
                    // Define four cases for different options. Don't forget "break".
                	case 1: 
                		finalNumberToPrint = addSums(numToOperateWith);
                		System.out.println("The sum of 1 to " + numToOperateWith + " is " + finalNumberToPrint);
                		break;
                	case 2: 
                		finalNumberToPrint = calcFactorial(numToOperateWith);
                		System.out.println("The factorial of " + numToOperateWith + " is " + finalNumberToPrint);
                		break;
                	case 3:
                		finalNumberToPrint = findLeftNum(numToOperateWith);
                		System.out.println("The leftmost digit of " + numToOperateWith + " is " + finalNumberToPrint);
                		break;
                	default: 
                		System.out.println("You appear to have entered an invalid selection.");
                		break; 
                		
                }
                System.out.println();
            }
        } while (userMenuChoice != 4);
        System.out.println("Bye");
        input.close();
    }

    /**
     * Print the menu
     */
    private static void displayMenu() {
        System.out.println("Please choose one option from the following menu:");
        System.out.println("1) Calculate the sum of integers from 1 to m");
        System.out.println("2) Calculate the factorial of a given number");
        System.out.println("3) Display the leftmost digit of a given number");
        System.out.println("4) Quit");
    }
    
    private static int addSums(int numToAdd) {
    	
    	int currentSum = 0;
    	for(int i = 1; i <= numToAdd; i++) {
    		currentSum += i;
    	}
    	return currentSum;
    }
    
    private static int calcFactorial(int numToFact) {
    	
    	int factorialReturn = 1;
    	for(int i = 1; i <= numToFact; i++) {
    		factorialReturn = factorialReturn * i;
    	}
    	
    	return factorialReturn;
    }
    
    private static int findLeftNum(int numToFindLeft) {
    	String numConvertedToString = new String();
    	int returnNumber;
    	numConvertedToString = String.valueOf(numToFindLeft);
    	returnNumber = Integer.parseInt(numConvertedToString.substring(0,1));
    	
    	return returnNumber;
    }
}