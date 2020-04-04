package cs342_AssignmentThree;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Driver driver = new Driver();
		
		driver.doStuff();
		

	}
	
	private int count;
	public void doStuff() {
		count = 0;
		
		System.out.println("1) Asterisk Pattern");
		asteriskPattern(1, 4);
		
		System.out.println("2) Converting Integer to String");
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
