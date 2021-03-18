/*  Write a program with  three different methods
 *  1 -  method 1. Asks the user for their name, returns the name and it has an empty parameter list
 *  2 -  method 2 . It takes a string argument and calculate the numerical value of the string literal
 *  Hint : Using the characters, add the numerical values of each character
 *  3- Use the main method to invoke the defined methods, use method one to grab the input from the user. 
 *  use the returned value of method 1 as an argument for  method two, print the return value of method 2 
 */
import java.util.Scanner;
public class Exercise {
	
	static Scanner input = new Scanner(System.in);
	
	public static String getName() {
		System.out.println("Enter a name: ");
		return input.next();
	}
	public static int numericalValue(String word) {
		int total = 0;
		for(int i = 0 ; i < word.length() ; i++) {
			total += word.charAt(i);
		}
		return total;
	}
	public static void main(String[] args) {
		String name= getName();
		
		int numberValue = numericalValue(name) ;
		
		System.out.println("The numerical value of \""+name +"\" is "+ numberValue);
	}
	
}
