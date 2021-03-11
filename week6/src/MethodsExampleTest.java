
public class MethodsExampleTest {
	
	public static void main(String[] args) {
		
		int result  = MethodsExample.sumOfTwo(9, 10);
		System.out.println(result);
		
		
		int result2  = MethodsExample.sumN2M(1, 3);
		System.out.println("Result "+result2); // 6
		
		 
		String sentence = "Paul drinks vodka";
		MethodsExample.replaceVodka(sentence);

		
		 
		String sentence1 = "Mari does not drink vodka";
		MethodsExample.replaceVodka(sentence1);
		
	}
	
}
