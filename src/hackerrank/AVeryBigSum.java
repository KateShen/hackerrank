package hackerrank;

import java.util.Scanner;

public class AVeryBigSum {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		 Scanner sc=new Scanner(System.in);
		 int length_array=sc.nextInt();
		 long count = 0;
		 for (int i = 0; i < length_array; i++) {
			long b=sc.nextLong();
			count=count+b;
		}
		 System.out.println(count);
		 
	    }
}
