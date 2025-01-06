package com.sijan.SinglyLinkedList;

public class DeleteinLinkedList {
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public void delete(int position) {
		if(position == 1) {
			head = head.next;
		}
		else {
			ListNode previous = head;
			int count = 1;
			while (count <position-1) {
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = current.next;
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
		DeleteinLinkedList sll = new DeleteinLinkedList();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);
		
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		
		sll.display();
		sll.delete(2);
		System.out.println(' ');
		sll.display();
	}
}
