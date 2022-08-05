package examples.Array;

public class Array {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2 }, { 2, 1 } };
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		int arr1[][] = { { 1, 2 }, { 2, 1 } };
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		int arr2[][] = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				arr2[i][j] = 0;
				for (int k = 0; k < 2; k++) {
					arr2[i][j] += arr[i][k] * arr1[k][j];
					arr2[i][j] += arr[i][k] + arr1[k][j];
					arr2[i][j] += arr[i][k] - arr1[k][j];
				}
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
