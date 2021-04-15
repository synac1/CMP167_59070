
public class Person {
	private String name;
	private int age;
	private String eyeColor;
	private double height;
	public Person() {
		this("", 0, "green", 1.76);
	}
	public Person(String name, int age, String eyeColor, double height) {
		this.name = name;
		this.age = age;
		this.eyeColor = eyeColor;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", eyeColor=" + eyeColor + ", height=" + height + "]";
	}
	
	public void speak (String words) {
		System.out.println(words);
	}
}
