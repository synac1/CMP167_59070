import java.util.Arrays;

public class SelectionSort {
	public static void sort(int [] arr) {
		for (int i = 0 ; i< arr.length-1; i++) {
			int index = i;
			for (int j = i+1; j<arr.length; j++) {
				if (arr[j]< arr[index])
					index = j;
			}

			int old  = arr[index];
			arr[index] = arr[i];
			arr[i] = old;
			
		}
	}
	public static void main(String[] args) {
		int []  numbers = {2, 1, 0, 6, 3};
		System.out.println(Arrays.toString(numbers));
		sort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
}
