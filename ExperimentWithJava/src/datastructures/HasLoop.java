package datastructures;

public class HasLoop {

	public static void main(String[] args) {
		LinkedList myList = new LinkedList(1);
		myList.append(2);
		myList.append(3);
		myList.append(4);
		myList.append(5);
		
		
		System.out.println(hasLoop(myList)); // Output: false

		myList.getTail().next = myList.getHead().next;
        
		
		System.out.println(hasLoop(myList)); // Output: true
	}

	

	private static boolean hasLoop(LinkedList myList) {
		datastructures.LinkedList.Node fast = myList.getHead();
		datastructures.LinkedList.Node slow = myList.getHead();
		while(fast!=null && fast.next!= null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;

	}

}
