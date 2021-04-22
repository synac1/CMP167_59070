
public class Student extends Person {
	private int studentId;
	private double gpa;
	private int numberOfCoursesTaken;
	private static int studentNumber;
	
	public Student() {
		super();
		this.studentId = ++studentNumber;
		this.gpa =0.0;
		this.numberOfCoursesTaken =0;
	}
	public Student(String name, int age, String eyeColor, double height, double gpa, int numberOfCoursesTaken) {
		super(name, age, eyeColor, height);
		this.gpa = gpa;
		this.numberOfCoursesTaken = numberOfCoursesTaken;
		this.studentId = ++studentNumber;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public int getNumberOfCoursesTaken() {
		return numberOfCoursesTaken;
	}
	public void setNumberOfCoursesTaken(int numberOfCoursesTaken) {
		this.numberOfCoursesTaken = numberOfCoursesTaken;
	}
	public int getStudentId() {
		return studentId;
	}
	
	@Override
	public String toString() {
		
		return "Student id: "+studentId +" GPA "+gpa+" CoursesTaken:"+numberOfCoursesTaken +" "+super.toString();
	}
	
	public boolean passed() {
		double chance = Math.random();
		return chance > .5;
	}

}
