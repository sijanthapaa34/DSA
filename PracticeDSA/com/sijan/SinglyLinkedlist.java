package com.sijan;

public class SinglyLinkedlist {

		private ListNode head;
		private static class ListNode{
			private int data;
			private ListNode next;
			
			public ListNode(int data) {
				this.data = data;
				this.next= null;
			}
		}
		public void display() {
			ListNode current = head;
			while(current !=null) {
				System.out.print(current.data +" ");
				current = current.next;
			}
		}
		public int length() {
			ListNode current = head;
			int count = 0;
			while(current !=null) {
				count ++;
				current = current.next;
		
			}
			return count;
		}
		public void AddnewHead(int value) {
			ListNode newnode = new ListNode(value);
			newnode.next = head;
			head = newnode;
		}
		public void Addlast(int value) {
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
		
		public ListNode deletefirst() {
			if(head == null) {
				return null;
				
			}
			ListNode temp = head;
			head = head.next;
			temp.next = null;
			return temp;
		}
		
		public ListNode deletelast() {
			if(head == null|| head.next == null) {
				return head;
			}
			ListNode current = head;
			ListNode previous = null;
			while ( current.next != null)
			{
				previous= current;
				current = current.next;
			}
			previous.next= null;
			return current;
		}
		public ListNode getNthNodefromEnd(int n) {
			if (head == null) {
				return null;
			}
			if (n<=0) {
				throw new IllegalArgumentException("Invalis value");
				
			}
			ListNode mainptr = head;
			ListNode refptr = head;
			int count = 0;
			while (count <n) {
				if(refptr == null) {
					throw new IllegalArgumentException(n + "is greater than the number of nodes in list");
				}
				refptr = refptr.next;
				count ++;
			}
			while(refptr != null) {
				refptr  = refptr.next;
				mainptr = mainptr.next;
			}
			return mainptr;
		}
		
		public static void main(String[] args) {
			SinglyLinkedlist sll = new SinglyLinkedlist();
			sll.head = new ListNode(10);
			ListNode second = new ListNode(1);
			ListNode third = new ListNode(8);
			ListNode fourth = new ListNode(11);
			
			sll.head.next = second;
			second.next = third;
			third.next = fourth;
			
			System.out.println("Before");
			sll.display(); 
			//System.out.println("\n" + sll.length());
//			sll.AddnewHead(3);
			System.out.println("");
//			System.out.println("After");
//			sll.display();
//			sll.Addlast(19);
			//System.out.println("After deleting "+sll.deletelast().data);
			ListNode nthnode = sll.getNthNodefromEnd(2);
			System.out.println("nth node from end is "+ nthnode.data);
			//sll.display();
		}
	}


