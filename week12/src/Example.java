
public class Example {
	
	public static void speak() {
		System.out.println("Hello");
		//speak();
	}
	public static int sumOne2N(int n) {
		if (n <= 0) {
			return 0;
		}
		else {
			return n + sumOne2N(n-1);
		}
	}
	public static int sumN2M(int n, int m) {
		if (m <= n) {
			return m;
		}else {
			return m +sumN2M(n, m-1);
		}
	}
	
	public static void main(String[] args) {
		int a = 5, b= 10;
		
		System.out.println(sumOne2N(a)); // expecting 15
		
		System.out.println(sumN2M(a, b)); //expecting 45
	}
}
