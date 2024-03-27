
public class CheckLLisPalindrome {
	// here we are checking whether the given list is palindrome or not by calculating the mid size of given linkedlist. 
	public Node head=null;
	public Node tail=null;
	public int size=0;
	
	
	
	class Node{
		int data;
		Node next;
		
		
		public Node(int data) {
			this.data=data;
			this.next=null;
			
		}
		
		
	}
	
	public void addNode(int data) {
		Node newNode=new Node(data);
		
		if(head==null) {
			head=newNode;
			tail=newNode;
		}else {
			tail.next=newNode;
			tail=newNode;
		}
		size++;
		
	}
	
	public Node reverseLL(Node temp) {
		Node prevNode=null;
		Node currNode=temp;
		Node nextNode=null;
		
		while(currNode!=null) {
			nextNode=currNode.next;
			currNode.next=prevNode;
			prevNode=currNode;
			currNode=nextNode;
		}
		
		return prevNode;

	}
	
	public void isPalindrome() {
		Node currNode=head;
		boolean flag=true;
		
		int mid=(size%2==0)? (size/2):((size+1)/2);
		
		for(int i=1;i<mid;i++) {
			currNode=currNode.next;
		}
		
		Node revHead=reverseLL(currNode.next);
		
		while(head!=null&&revHead!=null) {
			if(head.data!=revHead.data) {
				flag=false;
				System.out.print("given linklist is not palindrome");
				return;
			}
			head=head.next;
			revHead=revHead.next;
		}
		
		if(flag==true) {
			System.out.println("given linkedlist is a palindrome");
		}else {
			System.out.println("given linklist is not a palindrome");
		}
	}
	
	public void printLinkList() {
		Node currNode=head;
		
		if(head==null) {
			System.out.println("list is empty");
			return;
		}
		while(currNode!=null) {
			System.out.print(currNode.data+" ");
			currNode=currNode.next;
		}
		System.out.println();
	}

	public static void main(String[] args ) {
		CheckLLisPalindrome ok=new CheckLLisPalindrome();
		ok.addNode(1);
		ok.addNode(2);
		ok.addNode(3);
		ok.addNode(2);
		ok.addNode(1);
		ok.printLinkList();
		ok.isPalindrome();
		
		
		
	}

}
