# Java : Object Oriented Programming Language
## Four Pillars of the Object Oriented Programming 
- Inheritance
- Abstraction
- Encapsulation
- Polymorphims

# CREATING YOUR OWN ADT


- What is a class?  Category, Difference,Types
- Mammalia Class:  warm blood, teeth, fur/hair, breastfeeding

-  **class/type** : written description of the attributes and behaviors of objects. Analogy: Blueprint
- **object** : Instance of a class. Analogy: Physical representation of the blueprint/class
- **attributes**: Instance variables / member variables
- **behaviors**:  Instance methods / member methods

- **constructor** : A special method that has the same of the class. The task:
1. Initialize Your Instance variables
2. Instantiate Your object 

- **setters** : AKA mutators. Task: modify the value of the instance variables
- **getters** : AKA accessors. Task: return the value

- **equals** : Returns true if the value of the instance variables are the same
- **toString** : Returns the string representation of the object
- **compareTo**: Returns a 1 if the the value is greater, 0 if they are equal and -1 object value is less

```
UML

------------------------
|       Dog             |
-------------------------
| -name    : String      | 
| -species : String      | 
| -age     : int         |
-------------------------
| +Dog()
| +Dog(name: String)
| getName(): String
| setName(name: String) : void
| toString(): String 
```

