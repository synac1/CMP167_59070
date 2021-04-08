
public class Dog {

	private String name;
	private String species;
	private int age;
	
	public Dog() {
		this.name = "lacy";
		this.species = "GermanSherpard";
		this.age =2;	
		//this("Lacy", "GermanSherpard", 2);
	}
	
	public Dog (String name) {
		this(name, "Chihuahua", 1);
	}
	
	public Dog (String name, String species, int age) {
		this.name = name;
		this.species = species;
		this.age = age;
	}
	

	
	//getter 
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getSpecies() {
		return this.species;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	
	
	@Override
	public String toString() {
		return "Dog: name : "+getName()+", Species : "
				+ " "+getSpecies() + ". age: "+getAge();
	}
	//Exercise: Modify The Dog Class
	//1. Create setters and getters for the instance variables species and age
	//2. Create a constructor that takes in all the argurments for the corresponding
	// parameters, name, species and age
	// Modify the toString method, to use the getters instead of using the variables 
	//directly
}
