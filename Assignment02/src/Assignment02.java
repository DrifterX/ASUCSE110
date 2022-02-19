/*------------------------------------------------------------ 
// AUTHOR: Nic Holmes
// FILENAME: Assignment02.java
// SPECIFICATION: Find the average of three test scores
// FOR: CSE 110- Lab #1 
// TIME SPENT: 75 minutes //--------------------
---------------------------------------*/

import java.util.Scanner;

public class Assignment02 {
    
    public static void main(String[] args) {
        // declare and instantiate a Scanner
    	Scanner scan = new Scanner(System.in);

        // declare and initialize variables
       double lengthOfRoad;
       int numOfLanes, asphaltThickness;
       int numOfDaysToComplete = 1;
       final int TRUCK_CAPACITY = 10000;
       final int PRICE_OF_ASPHALT = 1000;
       final int ASPHALT_WEIGHT = 150;
       final int WIDTH_OF_LANE = 12;
       final int PIPE_LENGTH = 24;
       final int PIPE_COST = 500;
       final int WORKER_PAY = 25;
       final int HOURS_PER_DAY = 8;
       final int COST_PER_STOPLIGHT = 25000;
       final int FEET_PER_MILE = 5280;
       final int INCHES_PER_FOOT = 12;
       
        
        // collect inputs
       System.out.print("Length of road project (Miles) : ");
       lengthOfRoad = scan.nextDouble();
       System.out.print("Number of lanes                : ");
       numOfLanes = scan.nextInt();
       System.out.print("Depth of asphalt (inches)      : ");
       asphaltThickness = scan.nextInt();
       System.out.print("Days to complete project       : ");
       numOfDaysToComplete = scan.nextInt();
       
       
       scan.close();
        // compute required values
       double requiredAsphaltInLbs = (lengthOfRoad * FEET_PER_MILE) * (numOfLanes * WIDTH_OF_LANE) * ((float)asphaltThickness / INCHES_PER_FOOT) * (ASPHALT_WEIGHT);
       int truckLoadsToHaulAsphalt = (int)Math.ceil(requiredAsphaltInLbs / TRUCK_CAPACITY);
       int totalNumberOfStoplights = (int) ((Math.floor(lengthOfRoad) * numOfLanes) + (Math.floor(lengthOfRoad) * 2));
       int numConduitPipes = (int) Math.ceil(((lengthOfRoad) * FEET_PER_MILE) / PIPE_LENGTH);
       int crewNeeded = (int)Math.ceil((50 * lengthOfRoad * numOfLanes) / numOfDaysToComplete);
       double crewPay = crewNeeded * WORKER_PAY * HOURS_PER_DAY * numOfDaysToComplete;
       double pipeCost = numConduitPipes * PIPE_COST;
       double stopLightCost = totalNumberOfStoplights * COST_PER_STOPLIGHT;
       double asphaltCosts = truckLoadsToHaulAsphalt * PRICE_OF_ASPHALT;
       double totalProjectCost = crewPay + pipeCost + stopLightCost + asphaltCosts;
        
        // display results
        System.out.println("=== Amount of materials needed ===");
        System.out.println("Truckloads of Asphalt : " + truckLoadsToHaulAsphalt);
        System.out.println("Stoplights            : " + totalNumberOfStoplights);
        System.out.println("Conduit pipes         : " + numConduitPipes);
        System.out.println("Crew members needed   : " + crewNeeded);
        System.out.println("=== Cost of Materials ============");
        System.out.println("Cost of Asphalt       : $" + asphaltCosts);
        System.out.println("Cost of Stoplights    : $" + stopLightCost);
        System.out.println("Cost of Conduit pipes : $" + pipeCost);
        System.out.println("Cost of labor         : $" + crewPay);
        System.out.println("=== Total Cost of Project ========");
        System.out.println("Total cost of project : $" + totalProjectCost);
    }

}
