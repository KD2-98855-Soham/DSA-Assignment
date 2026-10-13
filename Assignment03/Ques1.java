package Assignment03;

public class Ques1 {
	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
			next = null;	
		}
	}
	
	private Node head;
	
	public Ques1() {
		head = null;
	}
	
	public void aftergivenData(int value, int existingdata) {
		Node newnode = new Node(value);
		
		if(head == null) {
			System.out.println("List is empty, cannot insert after existing data.");
			return;
		}
		else {
			Node trav = head;
			
			while(trav != null && trav.data != existingdata) {
				trav = trav.next;
				
			}
			
			if(trav != null) {
				newnode.next = trav.next;
				trav.next = newnode;
				
			}
			
			else {
				System.out.println("Element"+ existingdata + "not found in the list.");
			}
		
		}
	}
	
	public void beforgivenData(int value, int existingdata) {
		Node newnode = new Node(value);
		
		if(head == null) {
			System.out.println("List is empty, cannot insert after existing data.");
			return;
		}
		
		if(head.data == existingdata) {
			newnode.next = head;
			head = newnode;
		}
		else {
			Node trav = head;
			Node prev = null;
			
			while(trav != null && trav.data != existingdata) {
				prev = trav;
				trav = trav.next;
			}
			
			if(trav != null ) {
				newnode.next = trav;
				prev.next = newnode;
				
			}
			
			else {
				System.out.println("Element"+ existingdata + "not found in the list.");
			}
		}
	}
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
		
		if(head == null) {
			head = newnode;
			return;
		}
		else {
			newnode.next = head;
			head = newnode;
		}
		
		
		
	}
	
	public void display() {
		Node trav = head;
		
		while(trav != null) {
			System.out.print(" "+trav.data);
			trav = trav.next;
		}
	}

	public static void main(String[] args) {
		
		Ques1 qu = new Ques1();
		
		qu.addFirst(50);
		qu.addFirst(40);
		qu.addFirst(30);
		qu.addFirst(20);
		qu.addFirst(10);
		
		
		qu.aftergivenData(45, 40);
		
		qu.beforgivenData(15, 20);
		
		qu.display();
		
		

	}

}
