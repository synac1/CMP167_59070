//Write a program that calculates the sum and the average 
// of all numbers from 1 up to n where n is given by the user
//
import java.util.Scanner;
public class Program2 {
	public static void main(String[] args) {
		double average;
		int n;
		
		double sum = 0.0;
		int counter = 1;
		Scanner kb = new Scanner(System.in);
		
		//input
		System.out.println("Enter a number: ");
		n = kb.nextInt();
		
		//process
		while(counter <= n ) {
			System.out.println(counter);
			sum += counter; // sum = sum+ counter,   accumulator pattern 1, 2, 1+2 => 3
 			counter++;// counter +=1 ------counter = counter+1
		}
		average = sum/n;
		
		//output
		System.out.println("sum: "+ sum);
		System.out.println("average: "+average);
		
		// compound assignment operators
		/*
		        +=, -=, /=, %=, *=
		 */
	}
}
