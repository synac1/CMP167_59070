
public class Dog {

	private String name;
	private String species;
	private int age;
	
	public Dog() {
		this.name = "lacy";
		this.species = "GermanSherpard";
		this.age =2;		
	}
	
	public Dog (String name) {
		this.name = name;
		this.species ="Chihuahua";
		this.age = 1;
	}
	//getter 
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Dog: name : "+getName()+", Species : "
				+ " "+this.species + ". age: "+this.age;
	}
	
}
