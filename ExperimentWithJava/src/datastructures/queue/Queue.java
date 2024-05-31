package datastructures.queue;



public class Queue {
	private Node first;
	private Node last;
	private int length;
	class Node{

		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	
	}
	public Queue(int value) {
		Node node = new Node(value);
		first = node;
		last = node;
		length++;
	}
	public int getLength() {
		return length;
	}
	public Node getFirst() {
		return first;
	}
	public Node getLast() {
		return last;
	}
	
	public void print() {
		Node temp = first;
		while(temp!=null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	public void enqueue(int value) {
		Node node = new Node(value);
		if(length==0) {
			first = last = node;
		} else {
			last.next = node;
			last = node;
		}
		
		length++;
	}
	public Node dequeue() {
		Node temp = first;
		if(length==0) {
			return null;
		}
		if(length==1) {
			first = last = null;
		}else {
			first = first.next;
			temp.next = null;
		}
		length--;
		return temp;
	}
}
