package leetcode;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] nums1 = new int[] {0};
		merge(nums1, 0, new int[] {1}, 1);
		Arrays.stream(nums1).forEach(System.out::println) ;
	}

	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		if(m==0) {
			for (int i = 0; i < m+n; i++) {
				nums1[i] = nums2[i];
			}
		}else {
		for (int i = 0; i < m+n; i++) {
			for (int j = 0; j < n; j++) {
				
				
				if (nums1[i] < nums2[j] ) {
					continue;
				} else if(nums1[i] > nums2[j] ) {
					int temp = nums1[i];
					nums1[i] = nums2[j];
					nums2[j] = temp;
				} 
			}
		}
		}
		Arrays.stream(nums1).forEach(System.out::println) ;

	}

}
