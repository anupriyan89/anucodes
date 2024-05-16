package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;


public class ValidParenthesis {
	
	public static void main(String[] args) {
		String s = "[]";
		
		System.out.println(isValidParenthesis(s));

	}

	private static boolean isValidParenthesis(String s) {
		boolean result = false;
		String[] strs = s.split(""); //[{}]
		Deque<String> stack = new ArrayDeque<>();
		for(String str : strs) {
			System.out.println("String: "+str);
			System.out.println("Stack: "+stack);
			if(")".equals(str)) {
				if(!stack.isEmpty() && "(".equals(stack.peek())) {
					stack.pop();
				} else
					return false;
			}
			else if("}".equals(str)) {
				if( !stack.isEmpty() && "{".equals(stack.peek())) {
						stack.pop();
					} else
						return false;
			 }
			else if("]".equals(str) ) {
				if (!stack.isEmpty() && "[".equals(stack.peek())) {
					stack.pop();
				} else
					return false;
			 }
			else {
				stack.push(str);
			}
			 
			
		}
		System.out.println("Final Stack: "+stack);
		if(stack.isEmpty()) {
			result = true;
		}
		return result;
		
	}

}
