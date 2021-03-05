// Write a a program that calculates the sum of n random numbers, where n
// is given by the user, this program should display a floating point number as
// result, with 5 decimal places  after the dot
// Must use a while loop
// Example if result is 15, it should be displayed like this 15.00000+
import java.util.Random;
import java.util.Scanner;
public class Exercise {
	public static void main(String[] args) {
		Random rand  = new Random();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the amount of numbers:");
		int n = scanner .nextInt();
		double sum = 0.0;
		while (n > 0){
			int value = rand.nextInt(100);
			System.out.println(value); 
			sum += value; //sum = sum + value
			n --; // n = n-1 --> n -= 1
		}
		System.out.printf("Result %.5f ", sum);

	}
}
