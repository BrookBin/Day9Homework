package day9Homework;

public class BrokenCodeTwo {

	public static void main (String[] args) {// fix main method "public static void main (String args []){"
		double tempOne=84.7; // change data type to double
		 int tempTwo =66;
		
		boolean result; // change the string data type to boolean
		if (tempOne <= 0 && tempTwo >= 100) { // remove the spacing between the greater than and equal to sign and remove quotation and remove the extra &
			result = true;
		} else if (tempOne >= 100 && tempTwo <= 0) { //fix the greater than equal to sign and change the if else to else if, remove semicolon
			result = true;
		} else {
			result= false;
		}
		
		System.out.println(result); // remove 's' from results 
		
		String season = "Monday";

		switch ("fall") { // remove the boolean statement 
		
		case "fall": // replace the semicolon with colon, include a double quotation on the string fall
			System.out.println("Recovering from hot weather");
			break;
		case "winter":
			System.out.println("Toooo cold");			
			 
		case "spring": // replace the semicolon with colon, replace 's' with the string spring 
			System.out.println("Recovering from cold weather");			
			break;
		case "summer": // replace the semicolon with colon
			System.out.println("Toooo hot");			
			 
		default:  // replace the semicolon with colon
			System.out.println("Season does not exist!");	
		}
		
		
		for (int i = 0; i <10; i++){ // assign a value to i, the data type int and the key word for should be spelled with a lower case later, remove semicolon, and replace the comma with a semicolon
			 
			if (i == 5) { // remove the semicolon, remove the extra space between the equal signs, replace the parenthesis with curly braces  
				System.out.println("I equals to 5"); // add the semicolon at the end 
			} else { //  remove the parentheses
				System.out.println("i not equals"); // surround the the strings with double quotation 
			}
		}
		
}

}
	
	
	
 


