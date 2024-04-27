package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Is Palindrome?:"+isPalindrome(12210));

	}


	public static boolean isPalindrome(int x) {
		List<Integer> arrList = new ArrayList<>();
	
	while(x!=0 ) {
		int reminder = x%10;
		x=x/10;
		arrList.add(reminder);
		
	}
	
	for(int i=0;i<arrList.size();i++) {
		
		if(arrList.get(i)!=arrList.get(arrList.size()-1-i)) {
			return false;
		}
		
	}
		return true;
    
	}

}
