package cs342_AssignmentThree;

//---------------------------------------------------------------------------
//
//Homework Assignment #2
//1) Use recursion to make an ascending and descending Asterisk pattern
//2) Use recursion to take apart an integer and convert it to a string
//
//Author: Mujahid Kazi
//Date: 02/10/2020
//Class: MET CS342
//Issues: None known
//
//Description:
//This program will build a linked list of 10 Strings and 
//then a doubley linked list of 10 strings. The program
//will display the lists and delete the last element in
//the list.
//
//Assumptions:
//The linked list will be filled with 10 strings.
//


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
	
	
	private int count;
	
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

	public void asteriskPattern(int minAsterisk, int maxAsterisk) {
		String asterisk = "";
		

		
		
		if (minAsterisk > maxAsterisk) {
			
			for(int i = 0; i < minAsterisk - 1; i++) {
				asterisk += "*";
			}
			
			
			System.out.println(asterisk);
			return;
		}
		
		
		
		for(int i = 0; i < minAsterisk; i++) {
			asterisk += "*";
		}
		
		
		
		System.out.println(asterisk);
		asteriskPattern(minAsterisk + 1, maxAsterisk);
		
		System.out.println(asterisk);
		
	}
		
		

	
	
	public void integerToString(Integer aNumber) {
		String rtn = "";
		int counter = 1;
		int tempNum = 0;

		
		if(aNumber == 0  && count == 0) {
			System.out.println("This call returns " + aNumber);
			return;
			
		}else
		if(aNumber/counter == 0){
			return;
		}
		
		
		
		counter = counter * 10;

		count++;
		integerToString(aNumber/counter);

		
		rtn += aNumber;
		System.out.println("This call returns " + rtn);
		
		
	}
	

}
