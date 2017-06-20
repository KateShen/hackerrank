package hankerrankImplementation;

import java.util.Scanner;

public class bonappetit {
	static int bonAppetit(int n, int k, int b, int[] ar) {
        // Complete this function
		int total=0;
		for(int i=0;i<n;i++){
			total+=ar[i];
		}
		int real=(total-ar[k])/2;
		
		if (b>real) {
		return b-real;
		}
		else{ 
			return 0;
		}			
    }
	

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
    	//int n=4; int k=1; int b=7; int[] ar={3,10,2,9};
        int result = bonAppetit(n, k, b, ar);
        
        if (result==0) {
        	System.out.println("Bon Appetit");
		}else {
			System.out.println(result);
		}
        
    }
}
