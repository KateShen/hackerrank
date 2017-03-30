package hackerrank;

import java.util.Scanner;

public class Staircase {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		 Scanner sc=new Scanner(System.in);
		 int size=sc.nextInt();
		 for(int i=1;i<=size;i++){
			 for (int j = size-i; j >0; j--) {
				System.out.print(" ");
			}
			 
			 for(int k=1;k<=i;k++){
				 System.out.print("#");
			 }
			 
			 System.out.println();
		 }
	    }
}
