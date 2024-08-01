package leetcode;

public class ValidPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("race a car"));

	}
	
	public static boolean isPalindrome(String s) {
		
		StringBuilder sb = new StringBuilder();
		
		for(char c: s.toLowerCase().toCharArray()) {
			if((c>=97 && c<=122) || (c>=48 && c<=57)) {
				
				sb.append(c);
			}
		}
		
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i) != sb.charAt(sb.length()-1-i)) {
				return false;
			}
		}
		return true;
        
    }

}
