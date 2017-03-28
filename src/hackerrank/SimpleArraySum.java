package hackerrank;

import java.util.Scanner;

public class SimpleArraySum {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int count=0;
		for(int i=0;i<a;i++){
			count=count+sc.nextInt();
		}
		
		System.out.println(count);
		
		
    }
}
