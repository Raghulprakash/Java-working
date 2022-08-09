package practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0, b = 1, c ;
		System.out.println(a);
		System.out.println(b);
		System.out.println(" ");
		int i, count = 10;
		for (i = 2; i < count; ++i) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}

}
