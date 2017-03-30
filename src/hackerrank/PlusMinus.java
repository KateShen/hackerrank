package hackerrank;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		ArrayList<Integer> listset=new ArrayList<>();
		for (int i = 0; i < size; i++) {
		listset.add(sc.nextInt());
		}
//		listset.add(-4);
//		listset.add(3);
//		listset.add(-9);
//		listset.add(0);
//		listset.add(4);
//		listset.add(1);
		
//		int size=6;
		int count1=0;
		int count2=0;
		int count3=0;
		
		DecimalFormat df=new DecimalFormat("#0.000000");
		for(int i=0;i<listset.size();i++){
			if (listset.get(i)>0) {
				count1++;
		}else if (listset.get(i)<0) {
				count2++;
		}
			else {
				count3++;
			}	
		}
		System.out.println(df.format((double)count1/(double)size));
		System.out.println(df.format((double)count2/(double)size));
		System.out.println(df.format((double)count3/(double)size));
		
}
}
