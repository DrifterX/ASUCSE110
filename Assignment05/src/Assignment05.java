// CSE 110     : 14867 / Online
// Assignment  : Assignment 05
// Author      : Nicholas Holmes 1223468454
// Description : Collection of ten methods

public class Assignment05 {

    public static void main(String[] args) {
        // Codes below will test your methods:
        displayGreeting();
        displayText("test");
        printTotal(1,2,3);
        int total = getTotal(1,2,3);
        System.out.println(total);
        double average= getAverage(1,2,3);
        System.out.println(average);
        average= averageLength("test","test21", "testtest");
        System.out.println(average);
        int shortest = lengthOfShortest("test","test21");
        System.out.println(shortest);
        String stars=stringOfStars("test");
         System.out.println(stars);
        stars=maxStringOfStars("test","test21");
        System.out.println(stars);
        stars=midStringOfStars("test","test21", "testtest");
        System.out.println(stars);

    }
    
    // 1) Write (define) a static method named displayGreeting, 
    //  that takes no arguments and returns no value. 
    //  When this function is called, it should print the text "Hello, and welcome!".
    static void displayGreeting() {
    	System.out.println("Hello, and welcome!");
    }
    
    
    //2) Write (define) a static method named displayText, 
    //  that takes a single String argument and returns no value. 
    //  When this function is called, it should print the value of the argument that was passed to it.
    static void displayText(String printedText) {
    	System.out.println(printedText);
    }
    
    
    //3) Write (define) a static method named printTotal, 
    //  that takes three int arguments. 
    //  When this function is called, it should print the sum of the three arguments passed to it. 
    //  This function should return no value.
    static void printTotal(int firstNum, int secondNum, int thirdNum) {
    	int total = firstNum + secondNum + thirdNum;
    	System.out.println(total);
    }
    
    
    //4) Write (define) a static method named getTotal, 
    //  that takes three int arguments. 
    //  When this function is called, it should return the sum 
    //  of the three arguments passed to it as an int.
    static int getTotal(int firstNum, int secondNum, int thirdNum) {
    	return firstNum + secondNum + thirdNum;
    }
    
    
    //5) Write (define) a static method named getAverage, 
    //  that takes three int arguments. 
    //  When this function is called, it should return the average 
    //  of the three arguments passed to it as a double.
    static double getAverage(int firstNum, int secondNum, int thirdNum) {
    	return (firstNum + secondNum + thirdNum) / 3;
    }
    
    
    //6) Write (define) a static method named averageLength, 
    //  that takes three String arguments. 
    //  When this function is called, it should return the average length (number of characters) 
    //  of the String arguments passed to it as a double.
    static double averageLength(String firstString, String secondString, String thirdString) {
    	int firstStrLen = firstString.length();
    	int secondStrLen = secondString.length();
    	int thirdStrLen = thirdString.length();
    	
    	return (firstStrLen + secondStrLen + thirdStrLen) / 3;
    }
    
    //7) Write (define) a static method named lengthOfShortest, 
    //  that takes two String arguments. When this function is called, 
    //  it should return the length (number of characters) 
    //  of the shortest String argument passed to it as an int.
    static int lengthOfShortest(String firstString, String secondString) {
    	int firstStrLen = firstString.length();
    	int secondStrLen = secondString.length();
    	if(firstStrLen < secondStrLen)
    		return firstStrLen;
    	
    	return secondStrLen;
    }
    
    //8) Write (define) a static method named stringOfStars, 
    //  that takes one String argument.
    //  When this function is called, it should return a String of asterisks (*) 
    //  that is the same length as the string argument passed to it.
    static String stringOfStars(String inputString) {
    	int lenOfString = inputString.length();
    	
    	String starOutput = new String();
    	for(int i = 0; i < lenOfString; i++) {
    		starOutput += "*";
    	}
    	return starOutput;
    }
    
    
    //9) Write (define) a static method named maxStringOfStars, 
    //  that takes two String arguments. 
    //  When this function is called, it should return a String of asterisks (*) 
    //  that is the same length as the longest string argument passed to it.
    static String maxStringOfStars(String firstString, String secondString) {
    	int firstStrLen = firstString.length();
    	int secondStrLen = secondString.length();
    	String starOutput = new String();
    	if(firstStrLen < secondStrLen) {
    		for(int i = 0; i < secondStrLen; i++) {
    			starOutput += "*";
    		}
    	}
    	else {
    		for(int i = 0; i < firstStrLen; i++) {
    			starOutput += "*";
    		}
    	}
    	
    	return starOutput;
    }
    
    
    //10) Write (define) a static method named midStringOfStars, 
    //   that takes three String arguments. 
    //   When this function is called, it should return a String of asterisks (*) 
    //   that is the same length as the string argument with the length 
    //   that would be in the middle if the lengths of the arguments were arranged in ascending order.
    static String midStringOfStars(String firstString, String secondString, String thirdString) {
    	int firstStrLen = firstString.length();
    	int secondStrLen = secondString.length();
    	int thirdStrLen = thirdString.length();
    	
    	String starOutput = new String();
    	
    	if((firstStrLen < secondStrLen && firstStrLen > thirdStrLen) || (firstStrLen > secondStrLen && firstStrLen < thirdStrLen))
    		for(int i = 0; i < firstStrLen; i++) {
    			starOutput += "*";
    		}
    	if((secondStrLen < firstStrLen && secondStrLen > thirdStrLen) || (secondStrLen > firstStrLen && secondStrLen < thirdStrLen))
    		for(int i = 0; i < secondStrLen; i++) {
    			starOutput += "*";
    		}
    	if((thirdStrLen < firstStrLen && thirdStrLen > secondStrLen) || (thirdStrLen > firstStrLen && thirdStrLen < secondStrLen))
    		for(int i = 0; i < thirdStrLen; i++) {
    			starOutput += "*";
    		}
    	
    	return starOutput;
    }


}
