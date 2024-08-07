package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityNumber {

	public static void main(String[] args) {
		System.out.println(majorityElement(new int[] {2,2,6,2}));

	}
	
	public static int majorityElement(int[] nums) {
		int  result =0;
		int temp = 0;
		Map<Integer, Integer> counter = new HashMap<> ();
		for(int i=0;i<nums.length;i++) {
			if(counter.containsKey(nums[i])) {
				counter.put(nums[i], counter.get(nums[i])+1);
			} else {
				counter.put(nums[i], 1);
			}
		}
		
		for (Map.Entry<Integer, Integer> mapValue :
			counter.entrySet()) {
			
			 System.out.println(mapValue.getKey() + " = "
                     + mapValue.getValue());
			if(temp< mapValue.getValue()) {
        		result = mapValue.getKey();
        		temp= mapValue.getValue();
        	}
		}
		
		
        return result;
    }

}
