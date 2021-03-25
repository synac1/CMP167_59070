/*
 	Write a method that takes in a double array as argument and returns a new double with the 
 	elements of given array multiplied by 10. 
 */
public class Exercise {
	
	public static double []  multBy10(double [] arr) {
		double [] arrD = new double[arr.length];
		for (int i = 0; i < arr.length ; i++  ) {
			arrD[i] = arr[i]*10;
		}
		return arrD;
	}
}
