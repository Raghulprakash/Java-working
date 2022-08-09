package practice;

public class LargestofThreeNumbers {

	public static void main(String[] args) {
		int n1 = 1;
		double n2 = 3.678;
		int n3 = 2;

		if (n1 >= n2 && n1 >= n3)
			System.out.println(n1 + " is the largest number.");

		else if (n2 >= n1 && n2 >= n3)
			System.out.println(n2 + " is the largest number.");

		else
			System.out.println(n3 + " is the largest number.");
	}

}
