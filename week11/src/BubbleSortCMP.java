import java.util.Arrays;

public class BubbleSortCMP {
	public static void sort(int[] arr) {
		for (int i =0; i < arr.length - 1;  i++) {
			for(int j = 0; j < arr.length -1-i; j++) {
				if(arr[j]> arr[j+1]) {
					int old = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = old;
				}
				
			}
		}
	}
	public static void main(String[] args) {
		int[] numbers = {3, 5, 1, 4, 2, 3};
		System.out.println(Arrays.toString(numbers));
		sort(numbers);
		System.out.println(Arrays.toString(numbers));

	}
}
