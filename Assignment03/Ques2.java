package Assignment03;

import java.util.*;

public class Ques2 {
	
	static class Node{
		private int data ;
		private Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	
	public Ques2() {
		head = null;
	}
	
	public void addSorted(int value) {
		
		Node newnode = new Node(value);
		
		if(head == null|| head.data>=value) {
			newnode.next = head;
			head = newnode;
			return;
		}
		
		Node trav = head;
		while(trav.next != null && trav.next.data < value) {
			
			trav=trav.next;
			
		}
		newnode.next = trav.next;
		trav.next = newnode;
		
	}
	
	public void display() {
		Node trav = head;
		 while(trav!=null) {
			 System.out.print(trav.data+"->");
			 trav=trav.next;
		 }
	}

	public static void main(String[] args) {
		
		Ques2 qu = new Ques2();
		
		Scanner sc = new Scanner(System.in);
		
		
		qu.addSorted(50);
		qu.addSorted(5);
		qu.addSorted(40);
		qu.addSorted(30);
		qu.addSorted(20);
		qu.addSorted(10);
		
		qu.display();

	}

}
