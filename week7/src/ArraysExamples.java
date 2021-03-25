import java.util.Arrays;

public class ArraysExamples {
	public static void arraysImplementations() {
		int [] nums = new int [10];
		System.out.println(nums[5]); 
		double  []  arrayD = new double [100];
		System.out.println(arrayD[9]);
		String [] names = new String [10];
		System.out.println(names[0]);
		
		char[] letters = {'m', 'a', 'r', 'i'};
		
		String word = new String (letters);

		for (int i = 0; i < letters.length ; i++ ) {
			System.out.print(letters[i]+" ");
		}
		
		System.out.println();
		
		for (int i = 0; i < word.length() ; i++ ) {
			System.out.print(word.charAt(i)+" ");
		}
		
		System.out.println();
		Arrays.sort(letters);
		for (int i = 0; i < letters.length ; i++ ) {
			System.out.print(letters[i]+" ");
		}
		
		System.out.println();
		System.out.println('M'-0);
	}
	
	// Write a method that takes in an int array as an argument and display every value times 3
	public static void displayTimes3(int [] arr) {
		for(int i =0 ; i < arr.length ;i++) {
			System.out.println(arr[i]*3);
		}
		System.out.println("___________________________");
		for(int n: arr) {
			System.out.println(n*3);
		}
	}
	
	public static void main(String[] args) {
		// arraysImplementations();
		//String [] names = {"Mari", "Cindy", "joe"};
		int[]  nums = {9, 5, 4};
		//displayTimes3(nums);
		
		double [] numsD = { 2.5, 3.7,4.6, 84.5};
		double [] numsDBy10 = Exercise.multBy10(numsD);
	
		String numsDstr = Arrays.toString(numsD);
		String numsStr = Arrays.toString(numsDBy10);
	
		System.out.println(numsDstr);
		System.out.println(numsStr);
		
		System.out.println(numsD[1]); //3.7
		System.out.println(numsDBy10[0]); //25.0
		
	}
}
