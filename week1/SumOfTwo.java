/**
 * 
 * @author yanil
 *
 **/
import java.util.Scanner;
public class SumOfTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // We will be able to read from the keyboard
		System.out.println("Hello, this program adds two numbers");
		
		System.out.println("What is your name?");
		String name = sc.nextLine(); //waiting for a String input
		System.out.println("Your name is " +name);
		
		//input 
		System.out.print("Enter first number: "); // prompts the user for number 
		int firstNum = sc.nextInt(); //waits for the user to enter an int
		System.out.print("Enter second number: ");
		int secondNum = sc.nextInt(); 
		
		//process 
		int result = firstNum + secondNum;
		
		//output
		System.out.println("Result: "+ result);
		
	}
}
