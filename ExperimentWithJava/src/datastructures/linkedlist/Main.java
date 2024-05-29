package datastructures;

public class Main {

	public static void main(String[] args) {
		/* Practice calls*/
		LinkedList myLinkedList = new LinkedList(5);
		myLinkedList.append(1);
		myLinkedList.prepend(2);
		myLinkedList.set(0, 4);
		myLinkedList.insert(1, 2);
		//System.out.println(myLinkedList.remove(2).value);
		//myLinkedList.reverse();
		//myLinkedList.printAll();
		
		//System.out.println(myLinkedList.partitionList(2, myLinkedList));
		PartitionList list = new PartitionList(4);
		list.append(2);
		list.append(5);
		list.append(6);
		list.append(1);
		list.partitionList(3, list);
        myLinkedList.printAll();
        
	}

}
