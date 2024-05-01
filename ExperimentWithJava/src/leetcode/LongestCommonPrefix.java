package leetcode;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = new String[3];
		strs[0] = "flow";
		strs[1] = "flew";
		strs[2] = "flower";
		
		System.out.println(longestCommonPrefix(strs));

	}
	
	 

	private static String longestCommonPrefix(String[] strs) {
		String result = strs[0];
		for(int i=1;i<strs.length;i++) {
			while(strs[i].indexOf(result)!=0) {
				result = result.substring(0, result.length()-1);
				if(result.length()==0) {
					return "";
				}
			}
			
		}
		return result;
	}

}
