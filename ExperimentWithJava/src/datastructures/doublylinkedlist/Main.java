package datastructures.doublylinkedlist;


public class Main {

	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList(7);
		doublyLinkedList.append(9);
		doublyLinkedList.prepend(5);
		doublyLinkedList.prepend(8);
		doublyLinkedList.swapFirstLast();
		doublyLinkedList.reverse();
		doublyLinkedList.printList();

	}

}
