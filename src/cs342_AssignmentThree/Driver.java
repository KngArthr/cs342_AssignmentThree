package cs342_AssignmentThree;

//---------------------------------------------------------------------------
//
//Homework Assignment #2
//1) Use recursion to make an ascending and descending Asterisk pattern
//2) Use recursion to take apart an integer and convert it to a string
//
//Author: Mujahid Kazi
//Date: 04/07/2020
//Class: MET CS342
//Issues: None known
//
//Description:
//This program will print a pattern of asterisks
// increasing in size until the maximum number is reached.
// Then it will decrease in size until the minimum number is reached.
// 
// It will also take apart an integer and print it as a string
// 
// Both parts of the program will use recursion.
//
//Assumptions:
//The integer to pick apart will be above 0 and below the maximum number
//an int variable can hold.
//
//The numbers input into the asterisk parameters will be positive and
//the minum will be lower than the maximum


//
//Class: Driver
//
//Description:
//This class uses methods from other classes to put the program together.
//It is the driver of this program.
//

public class Driver {
	
///////////////////////////////////////////////////////////////////
/// main ///
/// Input : String[] args ///
/// Output: None///
/// Runs the program. Key methods are placed in to the main method to run the program.
/// Will print results into the console.
/// ///
///////////////////////////////////////////////////////////////////

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Driver driver = new Driver();
		
		driver.doStuff();
		
	}
	
	//variable used to count the recurses of the recusrion
	private int count;
	
///////////////////////////////////////////////////////////////////
/// doStuff ///
/// Input : None ///
/// Output: None///
/// Does Stuff. Calls on Methods to run the program.
///
/// ///
///////////////////////////////////////////////////////////////////

	
	public void doStuff() {
		
		//counts recurses
		count = 0;
		
		System.out.println("1) Asterisk Pattern");
		//first parameter will be minimum number of stars
		//second parameter will be maximum number of stars
		asteriskPattern(1, 4);
		
		System.out.println("2) Converting Integer to String");
		//convert parameter integer to a string and printing in console
		integerToString(2986887);
		
		
	}
///////////////////////////////////////////////////////////////////
/// asteriskPattern ///
/// Input : minimum number of asterisks and maximum number of asterisks ///
/// Output: None///
/// Prints asterisks from the minimum number in the first line.
/// Every new line prints one more asterisk than the last.
/// The middle three lines prints the maximum number of asterisks.
/// Finally, the asterisks print in descending order after the three middle line.
///
/// ///
///////////////////////////////////////////////////////////////////

	public void asteriskPattern(int minAsterisk, int maxAsterisk) {
		String asterisk = "";//what to print
		

		
		
		if (minAsterisk > maxAsterisk) {
			//base case: if the minimum number of asterisks becomes greater than the max,
			//add * to asterisk for the value in minAsterisk - 1
			//print the middle line of asterisks
			//and end the iteration of recursion.
			
			for(int i = 0; i < minAsterisk - 1; i++) {
				asterisk += "*";
			}
			
			
			System.out.println(asterisk);
			return;
		}
		
		//add * to asterisk for the value in minAsterisk
		
		for(int i = 0; i < minAsterisk; i++) {
			asterisk += "*";
		}
		
		
		//print the asterisk string
		//this produces the ascending portion
		System.out.println(asterisk);
		
		//call the asteriskPattern again with minAsterisk + 1
		asteriskPattern(minAsterisk + 1, maxAsterisk);
		
		//print the asterisk string after the method returns
		//this produces the descending portion
		System.out.println(asterisk);
		
	}
		
		
///////////////////////////////////////////////////////////////////
/// integerToString ///
/// Input : an integer ///
/// Output: None///
/// Breaks down the int and then prints as a string.
/// ///
///////////////////////////////////////////////////////////////////
	
	
	public void integerToString(Integer aNumber) {
		String rtn = "";//rtn contains the string that we will add the numbers to
		int counter = 1;
		int tempNum = 0;

		//if 0 is the entered number in the first iteration then just print that out.
		if(aNumber == 0  && count == 0) {
			System.out.println("This call returns " + aNumber);
			return;
			
		}else
		if(aNumber/counter == 0){
			//if the number divided by the counter equals zero then return.
			
			return;
		}
		
		
		counter = counter * 10;

		count++;//increments count for every iteration
		integerToString(aNumber/counter);//call on the method with the number divided by counter

		
		rtn += aNumber;//aNumber is added to rtn.
		System.out.println("This call returns " + rtn);//print outcome
		
		
	}
	

}
