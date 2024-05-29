package datastructures;

import datastructures.LinkedList.Node;

public class BinaryToDecimal {

	public static void main(String[] args) {
		 LinkedList myLinkedList = new LinkedList(0);
	        myLinkedList.append(0);
	        myLinkedList.append(1);
	        System.out.println(binaryToDecimal(myLinkedList)); // Output: 5

	}

	private static int binaryToDecimal(LinkedList myLinkedList) {
		int num = 0;
		Node temp = myLinkedList.getHead();
		while(temp!=null) {
			num = num*2+temp.value;
			temp = temp.next;
		}
		return num;
	}

}
