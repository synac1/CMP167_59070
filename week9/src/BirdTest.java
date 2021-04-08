
public class BirdTest {
	public static void main(String[] args) {
		Bird b1 = new Bird("Canary", true);
		Bird b2 = new Bird("Ostrich", false);
		Bird b3 = new Bird("Canary", true);
		
		System.out.println(b1+"\n"+b2+"\n"+b3);
		
		boolean ans1 = b1.equals(b2); //false
		boolean ans2 = b1.equals(b3); //false
		boolean ans3 = b1 == b3; //false 
		System.out.println("_______________________________________________");
		System.out.println("ans1: "+ans1 +"\nans2: "+ans2+"\nans3: "+ans3);
		
		System.out.println("_______________________________________________");
		Bird b4 = new Bird("Canary", true);
		System.out.println(b4);
		
	}
}
