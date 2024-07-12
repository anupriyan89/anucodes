package leetcode;

public class SearchInsert {

	public static void main(String[] args) {
		int [] nums = {1,3,4};
		int target = 5;
		System.out.println(searchInsert(nums, target));

	}

	private static int searchInsert(int[] nums, int target) {
		int result = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target) {
				result = i;
				break;
			} else if(nums[i]<target ) {
				result = i+1;
			}
		}
		return result;
	}

}
