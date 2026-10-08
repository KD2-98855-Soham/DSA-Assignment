package Assignment01;

public class Ques8 {
	
	public static int nonRepeating(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			
			boolean isRepeating = false;
			
			for(int j=0; j<arr.length; j++) {
				if(i != j && arr[i] == arr[j]) {
					isRepeating = true;
					break;
				}
			}
			if(!isRepeating) {
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		int result=nonRepeating(arr);
		
	System.out.println("The non repeating element is :"+result);
		
		
	}

}
