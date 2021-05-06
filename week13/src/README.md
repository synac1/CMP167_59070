# Binary search 
Time complexity  O(log n), O(1)
Space Complete O(1)
- Array is sorted
-idea 
to grab the middle index and check if the element at this index is the same as the target
-If the target is smaller than element at the middle, check the left half of the array 
- If the targe is greater  than the element at the middle  check in the right half the array.

```
int binarySearch(int [] arr, int target){
	int leftStart = 0;
	int rightEnd  = arr.length-1;
	while(leftStart <= rightEnd){
		int middle = leftStart +( rightEnd - leftStart)/2
		if (arr[middle]  == target)
			return middle;
		if (arr[middle]<target)
			leftStart  = middle + 1;
		else
			rightEnd = middle - 1;
	}
	return -1;
}

```
# Recursion 
A method calling itself
```
	public static int sumOne2N(int n) {
		if (n <= 0) {
			return 0;
		}
		else {
			return n + sumOne2N(n-1);
		}
			
	}

	int x = 10;
	sumOne2N(x) --->>
	10 + ( 9 + (8 +(7 + (6 +(5 + (4 +(3 + (2 + (1 +(0))))))))))

	10 + ( 9 + (8 +(7 + (6 +(5 + (4 +(3 + (2 + (1 + 0))))))))))
	10 + ( 9 + (8 +(7 + (6 +(5 + (4 +(3 + (3 ))))))))))
	10 + ( 9 + (8 +(7 + (6 +(5 + (4 +(6  ))))))))))
	10 + ( 9 + (8 +(7 + (6 +(5 + (10  ))))))))))
	....
```