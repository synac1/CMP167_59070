/**
 * 
 * @author yanil_jjrab3j
 * desc:
 * created: 4.15.21
 **/
public class Student {
	private String name;
	private double gpa;
	private int age;
	private int studentId;
	private static int studentCount;
	
	public Student(String name, double gpa, int age) {
		this.name = name;
		this.gpa = gpa;
		this.age = age;
		this.studentId = ++studentCount;
	}
	
	public Student (String name, int age) {
		this(name, 4.0, age );
	}
	
	public Student () {
		this("", 0.0, 0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + ", age=" + age + ", studentId=" + studentId + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if(obj instanceof Student) {
			Student otherStudent = (Student)obj;
			if(name.equals(otherStudent.name)
					&& Math.abs(gpa-otherStudent.gpa)<.00001
					&& age == otherStudent.age
					&& studentId == otherStudent.studentId) {
				return true;
			}
		}
		return false;
	}
	public void walk() {
		System.out.println("I am walking");
	}
	public void grow() {
		System.out.println("Today is my birthday, I turn "+(++age));
	}
	
	
}
