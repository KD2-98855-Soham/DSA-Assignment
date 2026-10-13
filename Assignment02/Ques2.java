package Assignment02;

import java.util.*;

public class Ques2 {
	private int arr[];
	private int SIZE;
	private int top;
	
	public Ques2(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = SIZE;
	}
	
	public void Push(int value) {
		if(isFull()) {
			System.out.println("Stack is full.");
		}
		else {
			top--;
			arr[top] = value;
		}
	}
	
	public int Pop() {
		int temp = -1;
		if(isEmpty()) {
			System.out.println("Stack is empty.");
		}
		else {
			temp = arr[top];
			top++;
		}
		return temp;
	}
	
	public int Peak() {
		int temp = -1;
		if(isEmpty()) {
			System.out.println("Stack is empty.");
		}
		else {
			temp = arr[top];
		}
		return temp;
	}
	
	public boolean isEmpty() {
		return top == SIZE;
	}
	
	public boolean isFull() {
		return top == 0;
	}

	public static void main(String[] args) {
		
		Ques2 qu = new Ques2(4);
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		do {
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peak");
			System.out.println("Enter the choice :");
			
			choice = sc.nextInt();
		
		switch(choice) {
		
		case 1 : 
			System.out.println("Enter the value to push :");
			int value = sc.nextInt();
			qu.Push(value);
			break;
			
		case 2 :
			System.out.println("Element popped out :" + qu.Pop());
			break;
			
		case 3 :
			System.out.println("Peaked value : " + qu.Peak());
			break;
		}
		}while(choice != 0);
		
		

	}

}
