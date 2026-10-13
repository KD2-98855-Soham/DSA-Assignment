package Assignment02;

import java.util.Scanner;

public class Ques1 {
	
	private int arr[];
	private int SIZE;
	private int front; 
	private int rear;
	
	public Ques1(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = 0;
		
	}
	
	public void Offer(int value) {
		if(isFull()) {
			System.out.println("Queue is full.");
		}
		else {
			rear++;
			arr[rear] = value;
		}
	}
	
	public int Poll() {
		int temp = -1;
		if(isEmpty()) {
			System.out.println("Queue is empty.");
		}
		else {
			temp = arr[front + 1];
			front++;
			
			if(front == rear) {
				front = rear  = -1;
			}
		}
		return temp;
	}
	
	public int Peak() {
		int temp = -1;
		if(isEmpty()) {
			System.out.println("Queue is empty.");
		}
		else {
			temp = arr[front +1];
			if(front == rear) {
				front = rear = -1;
			}
		}return temp;
	}
	
	public boolean isEmpty() {
		return front==rear;
	}
	
	public boolean isFull() {
		return rear == SIZE-1;
	}

	public static void main(String[] args) {
		
		Ques1 qu = new Ques1(4);
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		do {
			System.out.println("1.Offer");
			System.out.println("2.Poll");
			System.out.println("3.Peak");
			System.out.println("Enter the choice :");
			
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				System.out.println("Enter the value to add :");
				int value = sc.nextInt();
				qu.Offer(value);
				break;
			
			case 2:
				System.out.println("Pulled element : " + qu.Poll());
				break;
			
			case 3:
				System.out.println("Peaked element : " + qu.Peak());
				break;
			}
			
		}while(choice != 0);
		
		sc.close();

	}

}
