package com.sijan;

public class InsertinLinkedList {
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void insert(int position, int value) {
		ListNode node = new ListNode(value);
		if (position == 1) {
			node.next = head;
			head = node;
		}
		else {
			ListNode previous = head;
			int count = 1;
			while(count <value -1) {
				previous = previous.next;
				count ++;	
			}
			ListNode current = previous.next;
			node.next = current;
			previous.next = node;
		}
	}
	public void display() {
		ListNode current = head;
		while(current !=null) {
			System.out.print(current.data +" ");
			current = current.next;
		}
	}
	public static void main(String[] args) {
		InsertinLinkedList sll = new InsertinLinkedList();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);
		
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		
		sll.display();
		sll.insert(2,2);
		sll.display();
	}
}
