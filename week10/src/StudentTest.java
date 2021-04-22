
public class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student();
		
		Student student2 = new Student("Maritza", 19, "Hazel", 1.67, 4.0, 15);
		
		System.out.println(student1 +"\n"+ student2);
		
		String message = "has passed the course";
		boolean result = student2.passed();
		if (!result) message =  " has not passed the course";
		
		System.out.println("The student "+student2.getName()+ message);
	
	}
}
