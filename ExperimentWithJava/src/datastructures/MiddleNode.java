package datastructures;

public class MiddleNode {
	

	public static void main(String[] args) {
		LinkedList myList = new LinkedList(1);
		myList.append(2);
		myList.append(3);
		myList.append(4);
		myList.append(5);
		
		
		System.out.println(findMiddleNode(myList).value); // Output: 3

		myList.append(6);
		
		System.out.println(findMiddleNode(myList).value); // Output: 4
	}

	

	private static datastructures.LinkedList.Node findMiddleNode(LinkedList myList) {
		datastructures.LinkedList.Node fast = myList.getHead();
		datastructures.LinkedList.Node slow = myList.getHead();
		while(fast!=null && fast.next!= null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;

	}

}
