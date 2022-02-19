// CSE 110     : <Class #> / Online
// Assignment  : Assignment 04
// Author      : Nicholas Holmes 
// Description : Mastermind application

import java.util.List;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Assignment04 {

    public static void main(String[] args) {
    	//Instantiating scanner
    	Scanner sc = new Scanner(System.in);
    	
    	//declaring main variables
    	String randomNum = new String();
    	String replayGameResponse = new String();
    	int howManyGuesses;
    	//Special variable to allow recursive main call
    	String[] emptyArgs = new String[0];
    	
    	//Generate a random number and begin printing game
    	randomNum = generateNumber();
    	System.out.println("----- MASTERMIND -----");
    	System.out.println(" Guess the 4 digit number!");
    	
    	//Calls method to start the game
    	howManyGuesses = guessingGame(randomNum, sc);
    	
    	//Prints victory information and asks of the user wants to replay
    	System.out.println();
    	System.out.println("Congratulations! You guessed the right number in " + howManyGuesses + " guesses. ");
    	System.out.print("Would you like to play again (yes/no)? ");
    	replayGameResponse = sc.next();
    	System.out.println();
    	//Recursively calls main to restart the game if the user wants to play again
    	if(replayGameResponse.equalsIgnoreCase("yes")) {
    		main(emptyArgs);
    	}
    	
    	sc.close();
    	//System.out.print(output);
    }
    
    private static String generateNumber() {
    	Random rand = new Random();
    	return String.format("%04d", rand.nextInt(10000));
    }
    
    private static boolean checkNum(String enteredDigit, String masterDigit) {
    	//Check if totally correct
    	if (masterDigit.equals(enteredDigit) == true)
    		return true;
    	//Instantiate integer to track number correct
    	int numCorrect = 0; 
    	//Since not totally looping through the strings as CharArrays to compare.
    	for (int i = 0; i < enteredDigit.length(); i++) {
    		if(masterDigit.toCharArray()[i] == enteredDigit.toCharArray()[i])
    			numCorrect++;
    	}
    	//printing number matched and returning to guessingGame function with false to let it know to continue playing.
    	System.out.println("You matched " + numCorrect);
    	return false;
    }
    
    private static int guessingGame(String randomNum, Scanner sc) {
    	//Instantiating objects for the game
    	String guess = new String();
    	int numOfGuesses = 1;
    	
    	//Initial print outside of the loop to allow for first guess chance
    	System.out.print("Guess " + numOfGuesses + ":  ");
    	guess = sc.next();
    	//checking the number against the random number.
    	boolean currentStatus = checkNum(guess, randomNum);
    	//enters loop to continue until correct number is guessed.
    	while (currentStatus == false) {
    		numOfGuesses++;
    		System.out.print("\nGuess " + numOfGuesses + ":  ");
    		guess = sc.next();
    		currentStatus = checkNum(guess, randomNum);
    	}
    	//returns the total number of guesses to the main function for ending message.
    	return numOfGuesses;
    }
}
