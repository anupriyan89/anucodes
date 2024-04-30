package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
	static Map<String,Integer> romanMap = new HashMap<>();
	

	public static void main(String[] args) {
		romanMap.put("I", 1);
		romanMap.put("V", 5);
		romanMap.put("X", 10);
		romanMap.put("L", 50);
		romanMap.put("C", 100);
		
		System.out.println(convertToInt("XIV"));

	}

	private static int convertToInt(String roman) {
		int result = 0;
		int temp = 0;
		if(romanMap.containsKey(roman)) {
			result = romanMap.get(roman);
			
		} else {
			
			for(int i= roman.length()-1;i>=0;i--) {
				
				int val = romanMap.get(String.valueOf(roman.charAt(i)));
				 if(val >= temp) {
		                result+=val;
				 } else {
		                result-=val;
				 }
		            temp=val;
			}
			
		}
		return result;
		
	}

}
