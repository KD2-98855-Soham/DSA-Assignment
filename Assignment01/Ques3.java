package Assignment01;

import java.util.Scanner;

public class Ques3 {
	
	public static int nthocurranceElement(int arr[], int occ, int key) {
		int occurance = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(key == arr[i]) {
				occurance++;
			if(occ == occurance) {
				return i;
			}
			}
		}
		return -1;
		

	}

	public static void main(String[] args) {
		int arr[] = {1,2,2,3,4,5,2};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente the occurance of element to search :");
		
		int occ = sc.nextInt();	
		
		System.out.println("Enter the element to search :");
		int key = sc.nextInt();
		
		int index = nthocurranceElement(arr, occ, key);
		System.out.println(index);
		

	}

}
