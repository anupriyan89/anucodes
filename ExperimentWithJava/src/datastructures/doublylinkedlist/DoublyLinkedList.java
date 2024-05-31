package datastructures.doublylinkedlist;

public class DoublyLinkedList {
	
	private Node head;
	private Node tail;
	private int length;

	class Node {
		int value;
		Node next;
		Node prev;
		Node(int value) {
			this.value = value;
		}
	}
	
	public DoublyLinkedList(int val) {
		Node newNode = new Node(val);
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
	public void append(int value) {
		Node node = new Node(value);
		if(length==0) {
			head = node;
			tail = node;
		} else {
			tail.next=node;
			node.prev = tail;
			tail=node;
		}
		length++;
	}
	public Node removeLast() {
		if(length==0) {
			return null;
		}  
		Node temp = tail;
		if(length==1) {
			head = null;
			tail = null;
		} else {
			tail = tail.prev;
			tail.next =null;
			temp.prev = null;

		}
		length--;
		return temp;
	}
	
	public void prepend(int value) {
		Node node = new Node(value);
		if(length==0) {
			head = node;
			tail = node;
		} else {
			node.next = head;
			head.prev = node;
			head = node;
		}
		length++;
	}
	public Node removeFirst() {
		if(length==0) {
			return null;
		}  
		Node temp = head;
		if(length==1) {
			head = null;
			tail = null;
		} else {
			head = head.next;
			head.prev = null;
			temp.next = null;
		}
		length--;
		return temp;
	}
	public Node get(int index) {
		if(index<0 || index>=length) {
			return null;
		}
		Node temp = head;
		if(index<length/2) {
			for(int i=0;i<index;i++) {
				temp = temp.next;
			}
		} else {
			temp = tail;
			for(int i=length-1;i>index;i--) {
				temp = temp.prev;
			}
		}
		return temp;
	}
	public boolean set(int index, int value) {
		Node node = get(index);
		if(node!=null) {
			node.value = value;
			return true;
		} 
		return false;
	}
	public boolean insert(int value, int index) {
		if(index<0 || index>length) {
			return false;
		}
		if(index==length) {
			append(value);
			return true;
		}
		if(index==0) {
			prepend(value);
			return true;
		}
		Node node = new Node(value);
		Node before = get(index-1);
		Node after = before.next;
		node.prev= before;
		node.next= after;
		before.next = node;
		after.prev = node;
		return true;
	}
	public Node remove(int index) {
		if(index<0 || index>=length) {
			return null;
		}
		if(index==length-1) {
			return removeLast();
		}
		if(index==0) {
			return removeFirst();
		}
		Node temp = get(index);
		temp.next.prev = temp.prev;
		temp.prev.next = temp.next;
		temp.next=temp.prev=null;
		length--;
		return temp;
	}
	
	public void swapFirstLast() {
		if(length>1) {
			int temp;
			temp = head.value;
			head.value = tail.value;
			tail.value = temp;
		}
	}
	
	public void reverse() {
		if(length>1) {
			Node temp = head;
			Node current = null;
			while(temp!=null) {
				current = temp.prev;
				temp.prev = temp.next;
				temp.next = current;
				temp = temp.prev;
			}
			temp = head;
			head = tail;
			tail = temp;
			
		}
	}
	
	public boolean isPalindrome() {
		Node left = head;
		Node right = tail;
		while(left!=right) {
			if(left.value!=right.value) {
				return false;
			}
			left = left.next;
			right = right.prev;
		}
		return true;
	}
	
	

}
