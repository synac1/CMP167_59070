
public class MethodsExample {

	public static int sumOfTwo( int a, int b){
		return a + b ;
	}
	
	//method that returns the sum from n to m
	public static int  sumN2M (int n, int m) {
		int result = 0;
		for(int i = n ; i <= m ; i++ ) {
			result  += i;
		}
		return result;
	}
	//Write a method that replaces the word  vodka with  water 
	public static void replaceVodka(String sentence) {
		System.out.println(sentence.replace("vodka", "water" ));
	}
}
