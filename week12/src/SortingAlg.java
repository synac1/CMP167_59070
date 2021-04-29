import java.util.Arrays;

public class SortingAlg {
	public static void main(String[] args) {
		int [] arr = {23, 100, 24, 67};
		System.out.println(Arrays.toString(arr));
		arr[0] = arr[0] + arr[1];
		arr[1] = arr[0] - arr[1];
		arr[0] = arr[0] - arr[1];
		
		System.out.println(Arrays.toString(arr));
		
		int x = 10;
		int y = 5;
		x = x + y;
		
		System.out.println(x +" "+y);
		y = x - y;
		System.out.println(x +" "+y);
		x = x - y;
		System.out.println(x +" "+y);
		
		MergeSort.mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
