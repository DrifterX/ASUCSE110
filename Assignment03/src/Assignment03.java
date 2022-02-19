// CSE 110     : Online Spring 22A 14867
// Assignment  : Assignment 03
// Author      : Nicholas Holmes 
// Description : Program to give stock advice

import java.util.Scanner;

public class Assignment03 {

    public static void main(String[] args) {
        // declare and instantiate a Scanner
    	Scanner input = new Scanner(System.in);
        
        // declare and initialize variables
    	int currentShares, numSharesToBuy;
    	double purchasePrice, marketPrice, availableFunds, perShareValueDifference;
    	double totalValueToBuyDifference;
        final int TRANSACTION_PRICE = 10;
        
        
        // prompt for and collect inputs
    	System.out.println("Current Shares   : ");
    	currentShares = input.nextInt();
    	System.out.println("Purchase Price   : ");
    	purchasePrice = input.nextDouble();
    	System.out.println("Market Price     : ");
    	marketPrice = input.nextDouble();
    	System.out.println("Available Funds  : ");
    	availableFunds = input.nextDouble();
        
        // compute required values
    	perShareValueDifference = purchasePrice - marketPrice;
    	numSharesToBuy = (int)Math.floor(((availableFunds - TRANSACTION_PRICE) / marketPrice));
    	if(numSharesToBuy < 0) {
    		numSharesToBuy = 1;
    	}
    	perShareValueDifference = purchasePrice - marketPrice;
    	totalValueToBuyDifference = Math.abs(perShareValueDifference) * numSharesToBuy;
    	

        // display required outputs
    	if(purchasePrice < marketPrice && ((currentShares * marketPrice) - TRANSACTION_PRICE) > currentShares) {
    		if(Math.abs(totalValueToBuyDifference) > TRANSACTION_PRICE) {
    			System.out.println("Sell " + currentShares + " shares");
    		}
    		else if(Math.abs(totalValueToBuyDifference) < TRANSACTION_PRICE) {
    			System.out.println("Hold shares");
    		}
    	}
    	else if(purchasePrice > marketPrice && availableFunds > TRANSACTION_PRICE) {
    		if(totalValueToBuyDifference > TRANSACTION_PRICE) {
    			System.out.println("Buy " + numSharesToBuy + " shares");
    		}
    		else if(totalValueToBuyDifference < TRANSACTION_PRICE) {
    			System.out.println("Hold shares");
    		}
    	}
    	else {
    		System.out.println("Hold shares");
    	}

    }
}
