// CSE 110     : 14867 / Online
// Assignment  : Assignment 06
// Author      : Nicholas Holmes 1223468454
// Description : Collection of ten (more) methods

public class Assignment06 {

    public static void main(String[] args) {
        // Write any code here that you may wish to test your methods defined below.
		/*
		 * int[] myArray = {1, 22, 333, 400, 5005, 9}; int[] fourthFunctionReturn = new
		 * int[5]; int[] seventhFunctionReturn = new int[6]; int[] eighthFunctionReturn
		 * = new int[5]; int[] ninethFunctionReturn = new int[6];
		 * System.out.println("Function 1"); printArray(myArray, ", ");
		 * System.out.println(); printArray(myArray, " - "); System.out.println();
		 * 
		 * System.out.println("Function 2"); System.out.println(getFirst(myArray));
		 * System.out.println("Function 3"); System.out.println(getLast(myArray));
		 * System.out.println("Function 4"); fourthFunctionReturn =
		 * getAllButFirst(myArray); System.out.print("{"); for(int i = 0; i <
		 * (fourthFunctionReturn.length - 1); i++) {
		 * System.out.print(fourthFunctionReturn[i] + ", "); }
		 * System.out.print(fourthFunctionReturn[fourthFunctionReturn.length - 1] +
		 * "}"); System.out.println();
		 * 
		 * int[] anotherArray = {333, 22, 1, 400, 5005, 9};
		 * System.out.println("Function 5");
		 * System.out.println(getIndexOfMin(anotherArray));
		 * System.out.println("Function 6"); System.out.println(getIndexOfMax(myArray));
		 * System.out.println("Function 7"); seventhFunctionReturn =
		 * swapByIndex(myArray, 1, 4); System.out.print("{"); for(int i = 0; i <
		 * (seventhFunctionReturn.length - 1); i++) {
		 * System.out.print(seventhFunctionReturn[i] + ", "); }
		 * System.out.print(seventhFunctionReturn[seventhFunctionReturn.length - 1] +
		 * "}"); //swapByIndex(myArray, 1, 4); System.out.println();
		 * System.out.println("Function 8"); eighthFunctionReturn =
		 * removeAtIndex(myArray, 3); System.out.print("{"); for(int i = 0; i <
		 * (eighthFunctionReturn.length - 1); i++) {
		 * System.out.print(eighthFunctionReturn[i] + ", "); }
		 * System.out.print(eighthFunctionReturn[eighthFunctionReturn.length - 1] +
		 * "}"); System.out.println();
		 * 
		 * int[] anotherTestArray = {1, 22, 333, 400, 9};
		 * System.out.println("Function 9"); ninethFunctionReturn =
		 * insertAtIndex(anotherTestArray, 2, 777); System.out.print("{"); for(int i =
		 * 0; i < (ninethFunctionReturn.length - 1); i++) {
		 * System.out.print(ninethFunctionReturn[i] + ", "); }
		 * System.out.print(ninethFunctionReturn[ninethFunctionReturn.length - 1] +
		 * "}"); System.out.println();
		 * 
		 * int[] secondToLastTestArray = {22, 5005, 400, 333, 1, 9}; int[]
		 * finalTestArray = {1, 9, 22, 400, 5005}; System.out.println("Function 10");
		 * System.out.println(isSorted(secondToLastTestArray));
		 * System.out.println(isSorted(finalTestArray));
		 */
    	//Because I feel for you TA, here is the blurb in the assignment as opposed to the clear chaos above.
    	//Uncomment if you dare. 
    	int[] myArray = {1, 22, 333, 400, 5005, 9};
    	printArray(myArray, ", ");
    	printArray(myArray, " - ");
    	getFirst(myArray);
    	getLast(myArray);
    	getAllButFirst(myArray);
    	getIndexOfMin(myArray);
    	getIndexOfMax(myArray);
    	swapByIndex(myArray, 1, 4);
    	removeAtIndex(myArray, 3);
    	insertAtIndex(myArray, 2, 777);
    	isSorted(myArray);
    	

    }
    
    // 1) Write a public static method named printArray, 
    //   that takes two arguments. The first argument is an Array of int 
    //   and the second argument is a String. The method should print out 
    //   a list of the values in the array, each separated by the value of the second argument.
    public static void printArray(int[] arrOfInt, String separator) {
    	for(int i = 0; i < arrOfInt.length - 1; i++) {
    		System.out.print(arrOfInt[i] + separator);
    	}
    	System.out.print(arrOfInt[arrOfInt.length - 1]);
    }
    
    // 2) Write a public static method named getFirst, 
    //    that takes an Array of int as an argument and returns 
    //    the value of the first element of the array.
    public static int getFirst(int[] numbers) {
    	return numbers[0];
    }
    
    // 3) Write a public static method named getLast, 
    //    that takes an Array of int as an argument and returns 
    //    the value of the last element of the array.
    public static int getLast(int[] numbers) {
    	return numbers[numbers.length - 1];
    }
    
    // 4) Write a public static method named getAllButFirst, 
    //    that takes an Array of int as an argument and creates and returns 
    //    a new array with all of the values in the argument array except the first value.
    public static int[] getAllButFirst(int[] numbers) {
    	int[] stored = new int[numbers.length - 1];
    	int outputIndex = 0;
    	for(int i = 1; i < numbers.length; i++) {
    		stored[outputIndex] = numbers[i];
    		outputIndex++;
    	}
    	return stored;
    }
    
    // 5) Write a public static method named getIndexOfMin, 
    //    that takes an Array of int as an argument and returns 
    //    the index of the least value in the array.
    public static int getIndexOfMin(int[] numbers) {
    	int tester = 2^31;
    	int output = -1;
    	for(int i = 0; i < numbers.length; i++) {
    		if(tester > numbers[i]) {
    			tester = numbers[i];
    			output = i;
    		}
    	}
    	return output;
    }
    
    // 6) Write a public static method named getIndexOfMax, 
    //    that takes an Array of int as an argument and returns 
    //    the index of the largest value in the array.
    public static int getIndexOfMax(int[] numbers) {
    	int tester = -2^31;
    	int output = -1;
    	for(int i = 0; i < numbers.length; i++) {
    		if(tester < numbers[i]) {
    			tester = numbers[i];
    			output = i;
    		}
    	}
    	return output;
    }
    
    // 7) Write a public static method named swapByIndex, 
    //    that takes three arguments. The first argument is an Array of int, 
    //    and the second and third arguments are int indexes. 
    //    This method will swap the values at the two given index arguments 
    //    in the array, and return a reference to the array.
    public static int[] swapByIndex(int[] numbers, int firstIndex, int secondIndex) {
    	//int valueOne = numbers[firstIndex];
    	//numbers[firstIndex] = numbers[secondIndex];
    	//numbers[secondIndex] = valueOne;
    	
    	int[] outputObject = new int[numbers.length];
    	
    	for(int i = 0; i < numbers.length; i++) {
    		if(i == firstIndex)
    			outputObject[i] = numbers[secondIndex];
    		else if(i == secondIndex)
    			outputObject[i] = numbers[firstIndex];
    		else
    			outputObject[i] = numbers[i];
    		
    	}
    	
    	return outputObject;
    	
    }
    
    //8) Write a public static method named removeAtIndex, 
    //  that takes two arguments. The first argument is an Array of int, 
    //  and the second argument is an int index. This method create and return 
    //  a new array with all of the values in the argument array 
    //  except the value at the argument index.
    public static int[] removeAtIndex(int[] numbers, int indexToRemove) {
    	
    	int[] outputArray = new int[numbers.length - 1];
    	int outputIndex = 0;
    	for(int i = 0; i < numbers.length; i++) {
    		if(i == indexToRemove) 
    			continue;
    		outputArray[outputIndex] = numbers[i];
    		outputIndex++;
    	}
    	return outputArray;
    }
    
    //9) Write a public static method named insertAtIndex, 
    //   that takes three arguments. The first argument is an Array of int, 
    //   the second argument is an int index, and the third argument is an int value. 
    //   This method create and return a new array with all of the values 
    //   in the argument array and including the third argument value 
    //   inserted at the index specified by the second argument value.
    public static int[] insertAtIndex(int[] numbers, int indexToInsert, int valueToInsert) {
    	int[] outputArray = new int[numbers.length + 1];
    	int outputIndex = 0;
    	for(int i = 0; i < numbers.length; i++) {
    		if(i == indexToInsert) {
    			outputArray[outputIndex] = valueToInsert;
    			outputIndex++;
    		}
    		outputArray[outputIndex] = numbers[i];
    		outputIndex++;
    	}
    	
    	return outputArray;
    }
    
    //10) Write a public static method named isSorted, 
    //    that takes an Array of int as an argument. 
    //    This method should return the boolean value true 
    //    if all the element values in the array are in ascending order; 
    //    otherwise the method should return the boolean value false.
    public static boolean isSorted(int[] numbers) {
    	for(int i = 1; i < numbers.length; i++) {
    		if(numbers[i] < numbers[i - 1]) {
    			return false;
    		}
    	}
    	return true;
    }

}
