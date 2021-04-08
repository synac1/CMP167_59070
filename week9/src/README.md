# equals method
```
public boolean equals(Object obj) {
	if ( this  ==  obj){
		return true;
	} 
	if ( obj instanceof NameOfClass ){
		NameOfClass mObject = (NameOfClass) obj;
		if (this.attr1 == mObject.attr1 && this.attr2 == mObject.attr2){
			return true;
		}
	}
	return false ; 
}
```
# Exercise for this week 
## Create a *Student* class

* That has at least 3 attributes
* 1 default constructor and 2 overloaded constructors
* setters and getters for all attributes
* It has a static variable to track the amount of students
* It has  **equals** method and a **toString** method
* and Two custom methods of your own
