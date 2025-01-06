package com.sijan.SinglyLinkedList;

public class Removekey {
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void remove(int value) {
		ListNode toremove = new ListNode(value);
		ListNode current = head;
		ListNode temp = null;
		if (current != null && current.data == value) {
			head = current.next;
			return;
		}
		while(current !=null&& current.data != toremove.data ) {
			temp = current;
			current = current.next;
		}
		if(current == null) {
			return;
			}
		temp.next = current.next;	
	}

	public void display() {
		ListNode current = head;
		while(current !=null) {
			System.out.print(current.data +" ");
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
		Removekey sll = new Removekey();
		sll.head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);
		
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		sll.display();
		sll.remove(8);
		System.out.println(" ");
		sll.display();
		 
		
	}
}
