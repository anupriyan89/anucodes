package datastructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class PracticeStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		stack_push(stack);
		System.out.println("Stack : "+stack);
		stack_pop(stack);
		System.out.println("Stack : "+stack);
		stack_peek(stack);
		System.out.println("Stack : "+stack);
		stack_search(stack, 2);
		
		Deque<String> stack1 = new ArrayDeque<String>();
		stack1.push("Nyra");
		stack1.push("Tasha");
		stack1.push("Talia");
		System.out.println("Stack1 : "+stack1);
		System.out.println("Peek : "+stack1.peek());
		System.out.println("Poll: "+stack1.pollLast());

	}
	
	private static void stack_search(Stack<Integer> stack, int i) {
		System.out.println("Found "+i+" at position: "+stack.search(i));
		
	}

	private static void stack_peek(Stack<Integer> stack) {
		System.out.println("Peek : "+stack.peek());
		
	}

	private static void stack_pop(Stack<Integer> stack) {
		
		System.out.println("Pop : "+stack.pop());
		
	}

	static void stack_push(Stack<Integer> stack)
    {
        for(int i = 0; i < 10; i+=2)
        {
            stack.push(i);
        }
        
    }
	
	

}
