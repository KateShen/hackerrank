package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class ComparetheTriplets {
	public Integer[] comp(int a, int b){
		Integer[] consequence={0,0};
		if (a>b) {
			consequence[0]+=1;
		}
		else if (a<b) {
			consequence[1]+=1;
		}
		return consequence;
	}
	public static void main(String[] args) {
		ArrayList<Integer> end =new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        ComparetheTriplets ct=new ComparetheTriplets();
        end.add(ct.comp(a0,b0)[0]);
        end.add(ct.comp(a0,b0)[1]);
        
        end.add(ct.comp(a1,b1)[0]);
        end.add(ct.comp(a1,b1)[1]);
        
        end.add(ct.comp(a2,b2)[0]);
        end.add(ct.comp(a2,b2)[1]);
        
        int s1=end.get(0)+end.get(2)+end.get(4);
        int s2=end.get(1)+end.get(3)+end.get(5);
        
        System.out.printf(s1+" "+s2);
    }
}
