package datastructures;

class PartitionLL {

	public static void main(String[] args) {
		System.out.print(
				partition(new ListNode(4, new ListNode(2, new ListNode(5, new ListNode(3, new ListNode(6))))), 3).val);
	}

	public static ListNode partition(ListNode head, int x) {
		ListNode smallList = new ListNode(0);
		ListNode largeList = new ListNode(0);
		ListNode small = smallList;
		ListNode large = largeList;
		ListNode temp = head;
		while (temp != null) {
			if (x > temp.val) {
				small.next = temp;
				small = small.next;
			}
			if (x <= temp.val) {
				large.next = temp;
				large = large.next;
			}
			temp = temp.next;
		}
		small.next = largeList.next;
		large.next = null;
		return smallList.next;

	}
}