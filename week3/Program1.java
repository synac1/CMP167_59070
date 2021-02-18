//Write a program
// To ask the user for a number
// Display a message to say if it is even or not 
// Hint use the % modulo to check if user's input is even
import java.util.Scanner;
public class Program1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome this program identifies even");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		
		if(num1%2==0) 
			System.out.println(num1 + " is even");
		else 
			System.out.println(num1 +" is odd");
	}
}
