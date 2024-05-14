package datastructures;

import java.util.PriorityQueue;

public class PracticeQueue {

	public static void main(String[] args) {
		PriorityQueue<String> prQueue = new PriorityQueue<String>();
		prQueue.add("Nyra");
		prQueue.add("Tasha");
		prQueue.add("Talia");
		prQueue.add("Ross");
		
		System.out.println("Head : "+prQueue.peek());
		System.out.println("Queue : "+prQueue);
		System.out.println("Poll : "+prQueue.poll());
		System.out.println("Queue : "+prQueue);
		System.out.println("Remove : "+prQueue.remove());
		System.out.println("Queue : "+prQueue);

	}

}
