/**
 * 
 * @author yanil
 * desc
 * created
 */
import java.util.Scanner;
public class PrintMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Welcome, this program gets the max of two numbers");

		System.out.println("Enter two numbers separated by whitespace");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.println("The max is "+ num1);
		}
		else {
			System.out.println("The max is "+ num2);
		}
		System.out.println("Enter Yes if you want to continue");
		String answer  = sc.next();

		if( answer.equalsIgnoreCase("Yes") ) {
			System.out.println("Great");
		}else if(answer.equalsIgnoreCase("no")) {
			System.out.println("Ok");
		}else {
			System.out.println("Sorry I don't understand the answer");
		}

	}
}
