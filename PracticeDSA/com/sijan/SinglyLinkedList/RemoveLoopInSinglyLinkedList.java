package com.sijan.SinglyLinkedList;


public class RemoveLoopInSinglyLinkedList {
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
			this.next= null;
		}

	}

	public void removeloop() {
		ListNode fastptr = head;
		ListNode slowptr = head;
		while (fastptr != null && fastptr.next !=null) {
			fastptr = fastptr.next.next;
			slowptr = slowptr.next;
			if (slowptr == fastptr) {
			getStartingNode(slowptr);
			return;
			}
	}
	}
	
	private void getStartingNode(ListNode slowptr) {
		ListNode temp = head;
		while(temp.next != slowptr.next) {
			temp = temp.next;
			slowptr = slowptr.next;
					
		}
		slowptr.next = null; 
	}
	public void createLoopInLinkedList() {
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(5);
		ListNode sixth = new ListNode(6);
		
		head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next= third;
		
}
	public void display() {
		ListNode current = head;
		while(current !=null) {
			System.out.print(current.data +" ");
			current = current.next;
		}
	}
	public static void main(String[] args) {
		RemoveLoopInSinglyLinkedList sll = new RemoveLoopInSinglyLinkedList();
		sll.createLoopInLinkedList();
//		System.out.println(sll.containsLoop());
//		System.out.println(sll.startingNodeinLoop().data);
		sll.removeloop();
		sll.display();
		
		
	}
}
