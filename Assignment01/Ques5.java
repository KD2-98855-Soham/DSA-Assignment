package Assignment01;

public class Ques5 {
	
	public static int  fibnacciSeries(int n) {
		
		if(n<=1) {
			return n;
		}
		
		return fibnacciSeries(n-1) + fibnacciSeries(n-2);

	}

	public static void main(String[] args) {
		int n=5;
		
		for(int i=0; i<=n; i++) {
		
		 System.out.println( fibnacciSeries(i) + " ");
		}
    }
		

}
