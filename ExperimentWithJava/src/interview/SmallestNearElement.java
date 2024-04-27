package interview;

import java.util.Scanner;

public class SmallestNearElement {
	/* Find the smallest element from its neighboring elements eg: [5,2,3,4,6]. Here 2 is the smallest*/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int size = in.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {

			arr[i] = in.nextInt();
		}
		in.close();

		System.out.println("Result: " + smallestElement(arr));

	}

	private static int smallestElement(int[] arr) {
		int result =0;
		if( arr.length < 3) {
			System.out.println("Incorrect input");
		}
		for(int i=0;i<arr.length-2;i++) {
			if(arr[i]>=arr[i+1] && arr[i+1]<=arr[i+2]) {
				result = arr[i+1];
			}
		}
		return result;
	}

}
