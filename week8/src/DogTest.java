
public class DogTest {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog("tina");
		Dog dog4 = new Dog("Mary");
		
		System.out.println(dog1);
		System.out.println(dog2);
		System.out.println(dog3);
		System.out.println(dog4);
		
	
		System.out.println("______________");
		dog1.setName("willie");
	
		System.out.println(dog1);
		System.out.println(dog2);
		System.out.println(dog3);
		System.out.println(dog4);
		
		
	}

}
