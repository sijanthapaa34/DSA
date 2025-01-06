package com.sijan.SinglyLinkedList;

public class InsertNodeinSortedList {
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public ListNode insert(int value) {
		ListNode newNode = new ListNode(value);
		ListNode current = head;
		ListNode temp = null;
		while(current != null && current.data <newNode.data) {
			temp = current;
			current = current.next;
		}
		newNode.next = current;
		temp.next = newNode;
		return head;
	}
	public void display() {
		ListNode current = head;
		while(current !=null) {
			System.out.print(current.data +" ");
			current = current.next;
		}
	}
	
	public static void main(String[] args) {
		InsertNodeinSortedList sll = new InsertNodeinSortedList();
		sll.head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);
		
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		sll.display();
		sll.insert(5);
		sll.display();
		
	}
}
