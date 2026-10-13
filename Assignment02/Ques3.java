package Assignment02;

import java.util.Scanner;

public class Ques3 {
	
	private int arr[];
	private int SIZE;
	private int front;
	private int rear;
	private int count;
	
	public Ques3(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = -1;
		count = 0;
	}
	
	public void Offer(int value) {
		if(isFull()) {
			System.out.println("Queue is full.");
		}
		else {
			rear = (rear + 1)%SIZE;
			arr[rear] = value;
			count++;
		}
	}
	
	public int Poll() {
		int temp = -1;
		if(isEmpty()) {
			System.out.println("Queue is empty.");
		}
		else {
			temp = arr[(front + 1)%SIZE];
			front = (front + 1)%SIZE;
			count--;
		}
		return temp;
	}
	
	public int Peak() {
		int temp = -1;
		if(isEmpty()) {
			System.out.println("Queue is empty.");
		}
		else {
			temp = arr[(front + 1)%SIZE];
		}
		return temp;
	}
	
	public boolean isEmpty() {
		return count == 0;
	}
	
	public boolean isFull() {
		return count == SIZE;
	}

	public static void main(String[] args) {
		Ques3 cq = new Ques3(4);
		
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
				cq.Offer(value);
				break;
			
			case 2:
				System.out.println("Pulled element : " + cq.Poll());
				break;
			
			case 3:
				System.out.println("Peaked element : " + cq.Peak());
				break;
			}
			
		}while(choice != 0);
		
		sc.close();
		
	}
	

}
