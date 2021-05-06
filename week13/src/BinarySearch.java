

public class BinarySearch {

	static int binarySearch(int [] arr, int target){
		int leftStart = 0;
		int rightEnd  = arr.length-1;
		while(leftStart <= rightEnd){
			int middle = leftStart +( rightEnd - leftStart)/2;
			if (arr[middle]  == target)
				return middle;
			if (arr[middle]<target)
				leftStart  = middle + 1;
			else
				rightEnd = middle - 1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int [] numbers = { 1, 3, 5, 7, 9};
		int target = 40;
		int result = binarySearch(numbers, target);
		if (result == -1) 
			System.out.println("Target not found");
		else {
			System.out.println("target "+target +" found at index "+result);
		}
			
	}
}
