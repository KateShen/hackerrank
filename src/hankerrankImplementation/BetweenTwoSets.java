package hankerrankImplementation;

import java.util.ArrayList;
import java.util.Scanner;

public class BetweenTwoSets {
	static int getTotalX(int[] a, int[] b){
        // Complete this function
		for(int i=1;i<b.length;i++){
			int tmp=0;
			if (b[i-1]>b[i]) {
				tmp=b[i-1];
				b[i-1]=b[i];
				b[i]=tmp;
			}
		}
		for(int i=1;i<a.length;i++){
			int tmp=0;
			if (a[i-1]<a[i]) {
				tmp=a[i-1];
				a[i-1]=a[i];
				a[i]=tmp;
			}
		}
		ArrayList<Integer> firstselect=new ArrayList();
		int minb=b[0];
		int maxa=a[0];
		
		for(int i=maxa;i<=minb;i++){
			firstselect.add(i);
		}
        //System.out.println(firstselect);
        //set a as x factor
		for(int i=0;i<firstselect.size();i++){
			for (int j = 0; j < a.length; j++) {
				int res=firstselect.get(i)%a[j];
				if(res!=0){
					firstselect.set(i, 0);	
				}
				else if(res==0){
					continue;
				}
			}
		}
	
		//System.out.println(firstselect);
		//remove zero
//		for(int i=0;i<firstselect.size();i++){
//			if (firstselect.get(i)==0) {
//				firstselect.remove(i);
//			}
//		}
		//System.out.println(firstselect);
		//set x as b factor
		for(int k=0;k<firstselect.size();k++){
			for (int i = 0; i < b.length; i++) {
				if (firstselect.get(k)!=0 ) {
					int res=b[i]%firstselect.get(k);
					if (res!=0) {
						firstselect.set(k, 0);						
					}
					else if(res==0){
						continue;
					}
				}
				
			}
		}
		//System.out.println(firstselect);

		int result=0;
		
		for(int i=0;i<firstselect.size();i++){
			if (firstselect.get(i)!=0) {
				result++;
			}
		}
		
		//System.out.println(firstselect);
		return result;
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int m = in.nextInt();
//        int[] a = new int[n];
//        for(int a_i=0; a_i < n; a_i++){
//            a[a_i] = in.nextInt();
//        }
//        int[] b = new int[m];
//        for(int b_i=0; b_i < m; b_i++){
//            b[b_i] = in.nextInt();
//        }
    	int n=1;
    	int m=3;
    	int[] a={2};
    	int[] b={20,30,12};
        int total = getTotalX(a, b);
        System.out.println(total);
    }
}
