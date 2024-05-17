package hackerrank;

import java.util.Scanner;

public class StringTokens {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    String s = scan.nextLine();
		    scan.close();
		if(s.trim().isEmpty())
			System.out.println(0);
		else
			getStringTokens(s.trim());

	}

	private static void getStringTokens(String s) {
		String limiter = "[ !,?._'@]+";
		String[] strs = s.split(limiter);
		System.out.println(strs.length);
		for(String str: strs) {
			System.out.println(str);
		}
		
	}

}
