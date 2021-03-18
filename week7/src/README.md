int num1 = 10;
 int num2 =20;
 int  num3 =30;
int [] nums = {10, 20, 30};

Indexing => [] 

## Accessing 
nums[0] => 10
nums[3] => IndexOfBoundException  
mums[-1] => IndexOfBoundException

let **length** be the length of the array
How do I get the last element array
nums[length -1] => 30

## Modifying / assigning

nums [1] = 45;
nums => {10, 45, 30};

## Creating arrays

- datatype [] identifier = new datatype [size];
```
	double [] arrayD = new double [10];
```
- datatype [] identifier = {element, element, element, element};
```
	String [] arrayS = {"Marie", "Mary", "Mari"};
```
- datatype [] identifier = new datatype [] {element, element, element} ; 
```
 int [] arrayI = new int [] {1, 2, 3, 4, 67}; 
```

