#  Methods in Java

### Block of code that can be called whenever it needs to be used

## Benefits: Remove redondancy, makes code more readable
 
## Top-down and bottom-up design

## Defining a method
### Syntax

|Access Modifier| |static| DATATYPE IDENTIFIER (PARAMETERS) |EXCEPTIONS| 
{
	BODY
}

* If the method doesn't return anything the data type of this method is **void**

```
	public static int sumOfTwo( int a, int b){
		return a + b ;
	}
```

## return statement
### Syntax

return expression ;

### Semantics

* Evaluates the expression
* Replaces method call with return value
* Ends method call

## Method call
### Syntax

identifier (arguments) ;

```
 int result  = sumOfTwo(7, 8);
 System.out.println(result);

```
### Semantics

* hold a space in memory 
* give that space the name of the method call
* search for the method definition with the same signature as the method call
* if it finds the corresponding method, the argument values will be assigned to the parameter variables of the method
* it will execute the statements
* After everything has been executed the method call will end and the space in memory will be released
