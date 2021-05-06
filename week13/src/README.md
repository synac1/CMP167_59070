# Binary search 
Time complexity  O(log n), O(1)
Space Complete O(1)
- Array is sorted
-idea 
to grab the middle index and check if the element at this index is the same as the target
-If the elment is smaller than the target  repeat the same process but in the left side of the middle
- If the elment is bigger  than the target  repeat the same process but in the right side of the middle

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
