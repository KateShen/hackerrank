package hackerrank;

import java.util.Scanner;


public class DiagonalDifference {
	
	public int countdifference(int[][] a){
		int result=0;
		int count1=0;
		int count2=0;
		
		for(int i=0;i<a.length;i++){
			count1+=a[i][i];
			count2+=a[i][a.length-i-1];
		}
		 result=Math.abs(count1-count2);
		 System.out.println(result);
		 return result;
		
	}
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[][] table = new int[size][size];
		for (int i = 0; i < size; i++) {
			for(int j=0;j<size;j++){
				table[i][j]=sc.nextInt();
			}
		}
		
		//int[][] table={{11,2,4},{4,5,6},{10,8,-12}};
		DiagonalDifference df=new DiagonalDifference();
		df.countdifference(table);
		
    }
}
