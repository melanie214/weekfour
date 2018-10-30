package weekfour;

public class StringandStringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName = "Melanie";
		String lastName = "Lund"; 
		
		System.out.println(firstName + " " + lastName);
		
		String tripleHi = multiplyString("Hi" , 3); 
		System.out.println(tripleHi); 
		
		System.out.println(firstName.concat(lastName));
		System.out.println(firstName);
		

	}
	
	public static String multiplyString( String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += str; 
		}
			return result; 
		}
	}


