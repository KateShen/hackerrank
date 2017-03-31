package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class MiniMaxSum {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        
        
//        long a = 1;
//        long b = 2;
//        long c = 3;
//        long d = 4;
//        long e = 5;
        ArrayList<Long> list=new ArrayList<>();
        long[] resultlist=new long[5];
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        long count=a+b+c+d+e;
        for (int i = 0; i <list.size(); i++) {
			resultlist[i]=count-list.get(i);
		}
        
        //bubble sort
        long temp=0;
        int length=resultlist.length;
        for(int i=0; i<length;i++){
        	for(int j=1;j<length-i;j++){
        		long consequence=resultlist[j-1]-resultlist[j];
        		if (consequence>0) {
					temp=resultlist[j];
					resultlist[j]=resultlist[j-1];
					resultlist[j-1]=temp;
					
				}
        	}
        }
        System.out.println(resultlist[0]+"  "+resultlist[length-1]);
        
        
    }
}
