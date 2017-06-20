package hankerrankImplementation;
import java.util.Scanner;

public class divisiblesumpairs {
	static int divisibleSumPairs(int n, int k, int[] ar) {
        // Complete this function
		int result=0;
		int num1=0;
		int num2=0;
		if (n<=100 && n>=2 && k<=100 && k>=1) {
			
		
		for (int i = 0; i < n; i++) {
			num1=ar[i];
			for (int j = i+1; j < n; j++) {
				num2=ar[j];
				if ((num1+num2)%k==0) {
					result++;
				}
			}
		}}
		return result;
		
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }
}
