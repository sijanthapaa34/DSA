package com.sijan.SinglyLinkedList;

public class MergetwosortedLinkedList {

	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next= null;
		}
}
	public static ListNode merge(ListNode a,ListNode b) {
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		while(a != null && b!=null) {
			if(a.data<=b.data) {
				tail.next = a;
				a = a.next;
			}
			else {
				tail.next = b;
				b = b.next;
			}
			tail = tail.next;
		}
		if(a == null) {
			tail.next = b;
		}else {
			tail.next = a;
		}
		return dummy.next;

	}
	public void insertlast(int value) {
		ListNode newnode = new ListNode(value);
		if( head == null){
			head = newnode;
			return;
		}
		ListNode current = head;
		while(null!=current.next) {
			current = current.next;
		}
		current.next = newnode;
	}
	public void display() {
		ListNode current = head;
		while(current !=null) {
			System.out.print(current.data +" ");
			current = current.next;
		}
	}

	public static void main(String[] args) {
		MergetwosortedLinkedList sll1 = new MergetwosortedLinkedList();
		sll1.insertlast(1);
		sll1.insertlast(3);
		sll1.insertlast(13);
		
		MergetwosortedLinkedList sll2 = new MergetwosortedLinkedList();
		sll2.insertlast(2);
		sll2.insertlast(5);
		sll2.insertlast(7);
		sll2.insertlast(12);
		sll2.insertlast(14);
		sll1.display();
		sll2.display();
		
		MergetwosortedLinkedList result = new MergetwosortedLinkedList();
		result.head = merge(sll1.head, sll2.head);
		
		result.display();
		
	}
}
