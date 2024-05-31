package datastructures.doublylinkedlist;


public class Main {

	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList(3);
		doublyLinkedList.append(1);
		doublyLinkedList.prepend(2);
		doublyLinkedList.prepend(4);
		doublyLinkedList.swapFirstLast();
		doublyLinkedList.reverse();
		System.out.println(doublyLinkedList.isPalindrome());
		doublyLinkedList.printList();
		
		doublyLinkedList.printList();

	}

}
