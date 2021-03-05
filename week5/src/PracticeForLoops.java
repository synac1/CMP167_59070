/**
 * 
 * @author yanil
 *
 */

public class PracticeForLoops {
	public static void main(String[] args) {
		
	
		for(int  i = 0; i < 100 ; i++  ) {
			
			System.out.println("Hello");
			
		}
		
		for(int  i = 100 ; i <= 1000 ; i +=100  ) {
			
			System.out.println(i);
			
		}
		// i ++ ==>  ++i ===> i = i +1  ==>  i += 1
	
		for (int i = 1; i <= 5; i++) {
			for(int j = 1; j<= 5; j++ ) {
				System.out.print(i*j +"\t");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i ; j++ ) { 
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}
}
