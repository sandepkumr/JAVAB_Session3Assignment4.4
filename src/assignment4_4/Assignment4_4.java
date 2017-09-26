/**
 *  Java program to find perfect numbers between 1 and 100
 */
package assignment4_4;

/**
 * Class to calculate Aliquot sum of given number and display its result
 *
 */
class AliquotSum{
	
	int number;			//  Declaring number for which we need Aliguot sum
	int aliquotSum;		//  Declaring aliquot sum as instance variable
	
	/**
	 * Calculates the aliquot sum of given number 
	 * 
	 * @param number
	 * @return aliqoutSum
	 *  
	 */
	public int aliquotsum(int number) {
		
		this.number=number;			// Assigning number to instance variable
		this.aliquotSum=0;			// Assigning instance variable as 0
		
		for(int i=1;i<number;i++) { // looping from 1 to find all the divisors except number
			if (number%i==0)		// if remain is zero then sum all the numbers
				this.aliquotSum=this.aliquotSum+i; // Sum all the numbers to aliqoutSum variable
		}
				
		return aliquotSum; // return the result
				
	}
		
}

/**
 * Class to find if given number is Perfect number, using its Aliquot sum ( this Class extends AliqoutSum class )
 *
 */
class PerfectNumber extends AliquotSum {
	
	/**
	 * Print a number as Perfect number if number equals its Aliquot sum
	 * 
	 * @param number
	 * 
	 */
	void perfectNumber(int number) {
		
		if (number==super.aliquotsum(number)) // sees if number equals from return from Aliquot sum method
			System.out.println(number+" is a perfect number "); // Print number is a perfect number
	}
	
}

/**
 * class to print perfect numbers between 1 and 100
 *
 */
public class Assignment4_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // main method starts here
		// TODO Auto-generated method stub
		PerfectNumber mPerfectNumber = new PerfectNumber(); // Creating object for perfect number
		
		System.out.println("Printing perfect number between 1 and 100..."); // Printing message
		
		for (int number=1;number<=100;number++) { // Looping with local variable number from 1 to 100 and find if its perfect number
			
			mPerfectNumber.perfectNumber(number); // Call PerfectNumber using object to find given number is a perfect number 
			
		}
	}

}// Class closed
