/*------------------------------------------------------------ 
// AUTHOR: Nic Holmes
// FILENAME: Lab6
// SPECIFICATION: Find the average of three test scores
// FOR: CSE 110- Lab #1 
// TIME SPENT: 30 minutes //--------------------
---------------------------------------*/
import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int numStudents = -1;
       int i = 0;
       int[] studentGroups = null;//arrays are objects
       double[] studentGrades = null;
       int numGroups = -1;  // Part 2
       int currentGroupNum, currentGroupStudentNum;
       double currentGroupGrade;
       //ask for number of students
       System.out.println("How many students do you have?");
       numStudents = scanner.nextInt();
       
       //initialize the array based on user input
       studentGroups = new int[numStudents];
       studentGrades = new double[numStudents];
       
	   //complete the code here for part 1
       for(i = 0; i < numStudents; i++) {
    	   System.out.println("[Group #] and [Grade] for Entry " + (i + 1));
    	   studentGroups[i] = scanner.nextInt();
    	   studentGrades[i] = scanner.nextDouble();
       }

      
       // Part 2: Find the number of groups
       for(i = 0; i < numStudents; i++) {
    	   if (studentGroups[i] > numGroups)  {
               numGroups = studentGroups[i];
    	   }
       }
       

       // Print out the records
       // The code below is only for Part 2

       double[] groupAverages = new double[numGroups + 1];  // Avoid group 0
       int[] groupSizes = new int[numGroups + 1];  // Avoid group 0

       // For each student record,
       for(i = 0; i < numStudents; i++) {
    	   groupAverages[studentGroups[i]] += studentGrades[i];
    	   groupSizes[studentGroups[i]]++;
       }
       //   - find the group # and the grade, and
       //   - update groupAverages and groupSizes
       System.out.println("==== List of Student Records =====");
       for ( i = 0; i < numStudents; i++) {
    	   System.out.printf("Group %s - %s Points\n", studentGroups[i], studentGrades[i]);
       }



       // Display the statistics of groups
       System.out.println("==== Group Statistics ===");
       for(i = 1; i < groupAverages.length; i++) {
    	   double realAverage = groupAverages[i] / groupSizes[i];
    	   System.out.println("Group #" + i + " has " + groupSizes[i] + " students, average is " + realAverage);
       }

       scanner.close();
    }
}
