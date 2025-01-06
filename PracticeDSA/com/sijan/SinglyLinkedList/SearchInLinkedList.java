package com.sijan.SinglyLinkedList;

public class SearchInLinkedList {
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next= null;
		}
	}
	
	public boolean search(ListNode head, int searchKey) {
		ListNode current = head;
		while (current != null) {
			if(current.data== searchKey) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	public static void main(String[] args) {
		SearchInLinkedList sll = new SearchInLinkedList();
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);
		
		head.next = second;
		second.next = third;
		third.next = fourth;
		
		if(sll.search(head, 1)) {
			System.out.println("Search key found");
		}else {
			System.out.println(" not Found");
		}
		
}


}
