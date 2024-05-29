package datastructures;

import java.util.HashSet;
import java.util.Set;

import datastructures.LinkedList.Node;

public class RemoveDuplicates {

	public static void main(String[] args) {
		LinkedList myList = new LinkedList(1);
		myList.append(2);
		myList.append(1);
		myList.append(3);
		myList.append(2);
		myList.append(2);
		removeDuplicates(myList);
		myList.printList();
	}

	private static void removeDuplicates(LinkedList myList) {
		
		Set<Integer> dupSet = new HashSet<>();
		Node temp = myList.getHead();
		Node pre = myList.getHead();
		while(temp!=null) {
			if(dupSet.contains(temp.value)) {
				pre.next = temp.next;
			} else {
				dupSet.add(temp.value);
				pre = temp;
			}
			temp=temp.next;
		}
	}

}
