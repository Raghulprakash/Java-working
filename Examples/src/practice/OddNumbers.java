package practice;

public class OddNumbers {

	public static void main(String[] args) {
		int number = 100;
		System.out.println("List of odd numbers from 1 to 100 : ");
		for (int i = 1; i <= number; i++) {
			if (i % 2 != 0) {
				System.out.println(i + " ");
			}
		}
	}

}
