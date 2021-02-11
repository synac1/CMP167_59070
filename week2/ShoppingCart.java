/**
 * 
 * @author yanil
 *
 **/
import java.util.Scanner;
public class ShoppingCart {
	public static void main(String[] args) {
		Scanner sc; //Declare a Scanner variable
		String superMarket;
		double milk;
		double eggs;
		double cereal;
		//hint variables
		double totalEnd;
		double paid;
		double change;
		
		//Assigning to variable
		sc = new Scanner(System.in); //Creating a new Scanner obj and saving it
		superMarket ="Yani's SuperMarket";
		milk = 4.99;
		eggs = 3.78;
		cereal = 500.99;
		
		System.out.printf("Welcome, we have milk for $%.2f %n", milk );
		/*
		 %(flag)(width)(.precision point)specifier
		 flags : 0, -, +
		 width : amount of characters in the data
		 precision point: amount of decimal places after the dot
		 specifiers:
		 d : integers 
		 f : floating point numbers
		 c : char
		 s : String
		 n : newline
		 b : boolean
		 */
		//   \n  %n
		//String display =String.format("", args)
		System.out.println("How much milk do you want?");
		int total = sc.nextInt();
		System.out.printf("OK you want %d units of milk, you owe %.2f", total, (milk*total));
		
		/*
		Modify the ShoppingCart class so that it nicely displays all the items
		and price of the inventory and allow  the users to buy as many items 
		they want, at the end add up the total that the user must pay, 
		also if user pays  then you must return the change 
		 
		 */
		
	}
}
