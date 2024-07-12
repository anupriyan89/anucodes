package leetcode;

public class FirstOccurrence {

	public static void main(String[] args) {
		String haystack = "but", needle = "sad";
		System.out.println(firstOccurrence(haystack, needle));

	}

	private static int firstOccurrence(String haystack, String needle) {
		int result = 0;
		if(haystack.contains(needle)) {
			result = haystack.indexOf(needle);
		} else {
			result = -1;
		}
		return result;
	}

}
