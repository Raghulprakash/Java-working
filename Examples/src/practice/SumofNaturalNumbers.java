package practice;

public class SumofNaturalNumbers {

	public static void main(String[] args) {
		int num = 50, i = 1, sum = 0;
		while (i <= num) {
			sum = sum + i;
			i++;
		}
		System.out.println("Sum of First 50 Natural Numbers is : " + sum);
	}

}
