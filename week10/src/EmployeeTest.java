
public class EmployeeTest {

	public static void main(String[] args) {
		Person p1 = new Person("Nancy", 76,"blue", 1.6 );
		Employee emp1 = new Employee("Linda", 43, "hazel", 1.4 );
		System.out.println(p1);
		System.out.println(emp1);
		
		Person p2 = (Person)emp1;
		System.out.println(p2);
		
		//Employee emp2 = (Employee) p1;
		//System.out.println(emp2);
	}
}
