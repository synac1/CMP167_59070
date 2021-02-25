/**
 * 
 * @author Yanilda
 * desc
 * created: 2.25.21
 */
public class PracticeLoop {
	public static void main(String[] args) {
		int counter = 1;
		int limit =  10;
		while( counter <= limit ) {
			System.out.println(counter*counter);
			counter = counter +1;
		}
		
		System.out.println("Value inside counter: "+counter);
	}
}
