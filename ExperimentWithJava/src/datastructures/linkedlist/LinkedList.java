package datastructures.linkedlist;



public class LinkedList {

	private Node head;
	private Node tail;
	private int length;

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	public LinkedList(int value) {
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}

	public Node getHead() {
		return head;
	}

	public Node getTail() {
		return tail;
	}

	public int getLength() {
		return length;
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	public void printAll() {
		if (length == 0) {
			System.out.println("Head: null");
			System.out.println("Tail: null");
		} else {
			System.out.println("Head: " + head.value);
			System.out.println("Tail: " + tail.value);
		}
		System.out.println("Length:" + length);
		System.out.println("\nLinked List:");
		if (length == 0) {
			System.out.println("empty");
		} else {
			printList();
		}
	}

	public void append(int val) {
		Node node = new Node(val);
		if (length == 0) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
		length++;

	}

	public Node removeLast() {
		Node pre = head;
		Node temp = head;
		if (length == 0) {
			return null;
		}
		while (temp.next != null) {
			pre = temp;
			temp = temp.next;

		}
		tail = pre;
		tail.next = null;
		length--;
		if (length == 0) {
			head = null;
			tail = null;
		}
		return temp;
	}

	public void prepend(int val) {
		Node node = new Node(val);
		if (length == 0) {
			head = node;
			tail = node;
		} else {
			node.next = head;
			head = node;
		}
		length++;
	}

	public Node removeFirst() {
		Node temp = head;
		if (length == 0) {
			return null;
		}
		head = head.next;
		temp.next = null;
		length--; 
		if (length == 0) {
			tail = null;
		}
		return temp;
	}

	public Node get(int index) {
		Node temp = head;
		if (index < 0 || index >= length) {
			return null;
		}
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public boolean set(int index, int val) {
		Node temp = get(index);
		if (temp != null) {
			temp.value = val;
		}
		return false;
	}

	public boolean insert(int index, int val) {

		if (index < 0 || index > length) {
			return false;
		} else if (index == 0) {
			prepend(val);
			return true;
		} else if (index == length) {
			append(val);
			return true;
		}
		Node newNode = new Node(val);
		Node temp = get(index - 1);
		newNode.next = temp.next;
		temp.next = newNode;
		length++;
		return true;
	}

	public Node remove(int index) {
		if (index < 0 || index >= length) {
			return null;
		} else if (index == 0) {
			return removeFirst();
		} else if (index == length) {
			return removeLast();
		}
		Node pre = get(index - 1);
		Node temp = pre.next;
		pre.next = temp.next;
		temp.next = null;
		length--;
		return temp;

	}
	
	public void reverse() {
		Node temp = head;
		head = tail;
		tail = temp;
		Node after = temp.next;
		Node before = null;
		for (int i=0;i<length;i++) {
			after = temp.next;
			temp.next = before;
			before = temp;
			temp = after;
		}
	}
	
	

	
}
