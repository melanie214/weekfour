package weekfour;

public class inclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// two methods, first two int returns the sum. 
		// second, takes one int and divides it by 2 or 1/2 
		// print values in the main method 

	System.out.println(sum(45,89));
	System.out.println(div(90));
	
	printEven(40);
	}
	
	public static int sum( int x, int y) {
		int result = x + y; 
		return result;
		
		
	}
	
	public static double div(int x) {
		int result = x / 2; 
		return result; 
	}
	




// create a method that prints out all the numbers that are evenly divisble by two 


	public static void printEven(int number) {
		for(int i = 0; i <= number; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
				
			}
		}
	}
	
	
}