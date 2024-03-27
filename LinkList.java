// note-- it is not good practice to manipulate on head while traversing on any linkedlist.By doing manipulation on head of any
// linkedlist we can lose the starting point of our linkedlist.so,to avoid this situation we can store our head in currentNode and
// then we can traverse on linkedlist by using that currentNode.
// Every node in linked list stores data along with next pointer which stores the address of next node or which points out to next node.
public class LinkList {
	 Node head;
	 private int size;
	 
	 public LinkList() {
		 this.size=0;
	 }
	
	class Node{
		String data;
		Node next;
		
		public Node(String data) {
			this.data=data;
			this.next=null;
			size++;
		}
	}
	
	public void addFirst(String data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	
	public void addLast(String data) {
		Node newNode1=new Node(data);
		if(head==null) {
			head=newNode1;
			return;
		}
		Node currNode=head;
		while(currNode.next!=null) {
			currNode=currNode.next;
			
			
		}
		currNode.next=newNode1;
	}
	
	public void printList() {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		Node currNode=head;
		while(currNode!=null) {
			System.out.print(currNode.data+" -> ");
			currNode=currNode.next;
		}
		System.out.println("null");
	}
	
	public void deleteFirst() {
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		size--;
		head=head.next;
	}
	
	public void deleteLast() {
		
		if(head.next==null) {
			head=null;
			return;
		}
		
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		size--;
		
		Node secondLast=head;
		Node lastNode=head.next;
		while(lastNode.next!=null) {
			lastNode=lastNode.next;
			secondLast=secondLast.next;
		}
		secondLast.next=null;
	}
	
	public int getSize() {
		return size;
	}
	
	
	public void reverseList() {
		if(head==null || head.next==null) {
			return;
		}
		
		Node prevNode=head;
		Node currNode=head.next;
		while(currNode!=null) {
			Node nextNode=currNode.next;
			currNode.next=prevNode;
			
			prevNode=currNode;
			currNode=nextNode;
		}
		
		head.next=null;
		head=prevNode;
	}
	

	
	public static void main(String[] args) {
	LinkList list=new LinkList();
	list.addFirst("this");
	list.addLast("is");
	list.addLast("a");
	list.addLast("linked list");
	list.printList();
	list.deleteFirst();
	list.printList();
	list.deleteLast();
	list.printList();
    System.out.println(list.getSize());		
    list.addFirst("this");
    System.out.println(list.getSize());
    list.printList();
    list.reverseList();
    list.printList();
		
	}

}
