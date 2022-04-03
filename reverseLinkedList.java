package brijeshdsa;
  class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
	
  }
 
 
public class reverseLinkedList {
	
	public static void printLinkedList(Node head) {
		 while(head!=null) {
			 System.out.print(head.data+" ");
			 head=head.next;
		   }
	    }
	
	public static Node reverse(Node head) {
		 Node next=null;
		 Node pre=null;
		 Node current=head;
		 while(current!=null) {
			 next=current.next;
			 current.next=pre;
			 pre=current;
			 current=next;
		 }
		 head=pre;
		 return head;
	}
   public static void main(String args []) {
	   Node head=new Node(23);
	   head.next=new Node(78);
	   head.next.next=new Node(8);
	   head.next.next.next=new Node(780);
	   System.out.print("linkedlist:");
	    printLinkedList(head);
	    System.out.println("\nReversedLinkedList: ");
	    Node temp=reverse(head);
	    printLinkedList(temp);
			 
   }
}
