package com.sijan.SinglyLinkedList;

public class ReverseInLInkedList {
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next= null;
		}
	}
	public ListNode reverse(ListNode head) {
		if(head == null) {
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
	return previous;
	}
	
	public void display() {
		ListNode current = head;
		while(current !=null) {
			System.out.print(current.data +" ");
			current = current.next;
		}
	}
	public static void main(String[] args) {
		ReverseInLInkedList sll = new ReverseInLInkedList();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);
		
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		
		System.out.println("Before");
		sll.display(); 
		System.out.println("After");
		sll.reverse(sll.head);
		sll.display();
	}
}
