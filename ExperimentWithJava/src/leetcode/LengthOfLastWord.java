package leetcode;

public class LengthOfLastWord {

	public static void main(String[] args) {
		
		String word = "hello";
		
		System.out.println(lengthOfLastWord(word));

	}

	private static int lengthOfLastWord(String word) {
		
		int length = 0;
		String[] strs = word.split(" ");
		String last = "";
		for(String str : strs) {
			last = str;
		}
		length = last.length();
		return length;
	}

};
