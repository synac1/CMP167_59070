
public class Employee extends Person {
	int employeeId;
	static int emplCount;
	
	public Employee() {
		super();
		employeeId = ++emplCount;
	}
	
	public Employee(String name, int age, String eyeColor, double height) {
		super(name, age, eyeColor,height);
		employeeId = ++emplCount;
	}
	
	@Override
	public String toString() {
		return "EmployeeID:"+employeeId+" "+super.toString() ;
	}
	
	@Override
	public void speak (String words) {
		System.out.println("Wow "+ words);
	}
	
	
	
	
}
