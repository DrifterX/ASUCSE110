/*-------------------------------------------------------------
// AUTHOR: Nic Holmes.
// FILENAME: Lab3.java.
// SPECIFICATION: Takes user inputs, validates they are within the range and outputs the class grade based on weighted assignments/exams.
// FOR: CSE 110- Lab #3
// TIME SPENT: 1 hour.
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        // This scanner is prepared for you to get inputs
        Scanner scanner = new Scanner(System.in);
        // Declare three variables for HW, midterm, and final exam grades
        int homework = 0, midTerm = 0, finalExam = 0;
        //final int CLASS_POINTS_TOTAL = 400;
        // Declare a loop control variable i
        int i = 0;
        //Declare variable for number of tries.
        int j = 2;

        while (i < 3) {
            // Design if-else control flow:
            //
            if(i == 0) {
            	System.out.print("Enter your HOMEWORK grade: ");
            	homework = scanner.nextInt();
            	while(homework < 0 || homework > 100) {
            		System.out.println("[ERR] Invalid input. A homework grade should be in [0, 100].");
            		System.out.print("Enter your HOMEWORK grade (" + j + " chances left):");
            		homework = scanner.nextInt();
            		j--;
            		if(j < 0) {
                    	System.out.println("[ERR] You have tretired 3 times. Please restart your program.");
                        scanner.close();
                    	return;
            		}
            	}
            	i++;
            	j = 2;
            } else if(i == 1) {
            	System.out.print("Enter your MIDTERM EXAM grade: ");
            	midTerm = scanner.nextInt();
            	while(midTerm < 0 || midTerm > 100) {
            		System.out.println("[ERR] Invalid input. A midterm grade should be in [0, 100].");
            		System.out.print("Enter your MIDTERM EXAM grade (" + j + " chances left):");
            		midTerm = scanner.nextInt();
            		j--;
            		if(j < 0) {
                    	System.out.println("[ERR] You have tretired 3 times. Please restart your program.");
                        scanner.close();
                    	return;
            		}
            	}
            	i++;
            	j = 2;
            } else if(i == 2) {
            	System.out.print("Enter your FINAL EXAM grade: ");
            	finalExam = scanner.nextInt();
            	while(finalExam < 0 || finalExam > 200) {
            		System.out.println("[ERR] Invalid input. A final grade should be in [0, 200].");
            		System.out.print("Enter your FINAL EXAM grade (" + j + " chances left):");
            		finalExam = scanner.nextInt();
            		j--;
            		if(j < 0) {
                    	System.out.println("[ERR] You have tretired 3 times. Please restart your program.");
                        scanner.close();
                    	return;
            		}
            	}
            	i++;
            }
        }
        // Calculate the weighted total by the formula showed in the PDF
        // -->
        //double weighted_total = ((homework + midTerm + finalExam) / CLASS_POINTS_TOTAL) * 100;

        double weighted_total = ((finalExam / (double) 200) * 50) + (midTerm * .25) + (homework * .25);
        // Show the weighted total and tell the user s/he passed or not
        // -->
        System.out.println("[INFO] Student's Weighted total is " + weighted_total);
        if (weighted_total >= 50) {
            System.out.println("[INFO] Student PASSED the class");
        } else {
        	System.out.println("[INFO] Student FAILED the class");
        }

        scanner.close();

    }  // End of main
}  // End of class
