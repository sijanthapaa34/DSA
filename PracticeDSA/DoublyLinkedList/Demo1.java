package DoublyLinkedList;

public class Demo1 {
	private ListNode head;
	private ListNode tail;
	private int length;
	
 private class ListNode{
	 private ListNode next;
	 private ListNode previous;
	 private int data;
	public ListNode(int data) {
		this.data = data;
	}
	 
 }
 public Demo1() {
	 this.head = null;
	 this.tail = null;
	 this.length = 0;
 }
 public boolean isempty() {
	 return length == 0;
}
 public int length()
 {
	 return length;
 }
 public void insertlast(int value) {
	 ListNode newNode = new ListNode(value);
	 if(isempty()) {
		 head = newNode;
	 }
	 else {
		 tail.next = newNode;
	 }
	 newNode.previous = tail;
	 tail = newNode;
	 length++;
 }
 public void insertFirst(int value) {
	 ListNode newNode = new ListNode(value);
	 if (isempty()) {
		 tail = newNode;
	 }
	 else {
		 head.previous = newNode;
	 }
	 newNode.next = head;
	 head = newNode;
 }
 public void display() {
	 if(head == null) {
		 return;
	 }
	 ListNode temp = head;
	 while(temp !=null){
		 System.out.print(temp.data + "-->");
		 temp = temp.next;
	 }
	System.out.println("null");
 }
 public void displaybackward() {
	 if(tail == null) {
		 return;
	 }
	 ListNode temp = tail;
	 while(temp !=null){
		 System.out.print(temp.data + "-->");
		 temp = temp.previous;
	 }
	 System.out.println("null");
 }
 public static void main(String[] args) {
	Demo1 dm = new Demo1();
	dm.insertlast(1);
	dm.insertlast(5);
	dm.insertlast(7);
	dm.insertlast(8);
	dm.insertlast(10);
	dm.insertlast(13);
	dm.insertlast(11);
	
	System.out.println("Forward");
	dm.display();
//	System.out.println("Backward");
//	dm.displaybackward();
	dm.insertFirst(4);
	dm.display();

	
}
}
