package hackerrank;

import java.util.Scanner;

public class SubArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {

			arr[i] = in.nextInt();
		}
		in.close();

		System.out.println("Result: " + subArray(arr));

	}

	private static int subArray(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum =0;
			for (int j = i; j < arr.length; j++) {
				sum = sum+arr[j];
				if (sum < 0) {
					count = count + 1;
				}

			}
		}

		return count;
	}

}
