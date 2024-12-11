package com.sijan;


public class SinglyLinkedlist2 {
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next= null;
		}
	}
	
	public void insert (int position, int value)
	{
		ListNode node = new ListNode(value);
		if(position ==1){
			node.next = head;
			head = node;
		}else {
			ListNode previous = head;
			int count = 1;
			while(count < position-1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = node;
			 node.next = current;
		}
	}
}
