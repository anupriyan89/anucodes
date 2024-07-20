package leetcode;



public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] nums = {2,2,5,7,7};
		System.out.println(removeDuplicates(nums));

	}
	public static int removeDuplicates(int[] nums) {
		int j = 1;
		for(int i=1;i<nums.length;i++) {
			if(nums[i-1]!=nums[i]) {
				nums[j]=nums[i];
				j++;
			} 
		}
		return j;
	}

}
