package Assignment01;

import java.util.Scanner;

public class Ques2 {
	
	public static int lastOccurance(int arr[], int key) {
		
		for(int i=arr.length-1; i>=0; i--) {
			if(key == arr[i]) {
				return i;
			}
			
		}
		return -1;

	}
	
	

	public static void main(String[] args) {
		
		int arr[] = {1,1,1,2,2,3,3,3,4,4,4};
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key to search its last occurance :");
		int key = sc.nextInt();
		
		int index = lastOccurance(arr, key);
		
		if(index != -1) {
			System.out.println("The last occurrance of key is :" + index);
		}
		else {
			System.out.println("Key not found.");
		}
		
		
		

	}

}
