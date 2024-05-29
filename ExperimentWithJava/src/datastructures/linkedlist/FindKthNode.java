package datastructures;

public class FindKthNode {

	public static void main(String[] args) {
		 LinkedList myLinkedList = new LinkedList(1);
	        myLinkedList.append(2);
	        myLinkedList.append(3);
	        myLinkedList.append(4);
	        myLinkedList.append(5);

	        System.out.println(findKthFromEnd(2, myLinkedList).value); // Output: 4
	       
	        System.out.println(findKthFromEnd(5, myLinkedList).value); // Output: 1
	       
	        System.out.println(findKthFromEnd(6, myLinkedList)); // Output: null

	}
	public static datastructures.LinkedList.Node findKthFromEnd(int k, LinkedList myLinkedList) {
		datastructures.LinkedList.Node temp = myLinkedList.getHead();
		datastructures.LinkedList.Node pre = myLinkedList.getHead();
		int len = 0;
		while(temp!=null) {
			temp = temp.next;
			len++;
		}
		if(k>len) {
			return null;
		} else if(k==len) {
			return pre;
		} 
		if(len>k) {
			temp = myLinkedList.getHead();
			while(len-k!=0) {
				temp=temp.next;
				len--;
			}
		}
		return temp;
	}

}
