package hankerrankImplementation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class migratorybirds {
	 static int migratoryBirds(int n, int[] ar) {
	        // Complete this function
		 int[] arrayres={0,0,0,0,0};
		 HashMap<Integer,Integer> end=new HashMap();
		 
		 for (int i = 0; i < n; i++) {
			if (ar[i]==1) {
				arrayres[0]++;
			}
			else if (ar[i]==2) {
				arrayres[1]++;
			}
			else if (ar[i]==3) {
				arrayres[2]++;
			}
			else if (ar[i]==4) {
				arrayres[3]++;
			}
			else if (ar[i]==5) {
				arrayres[4]++;
			}
		}
		
		 for(int j=0;j<arrayres.length;j++){
				end.put(j,arrayres[j]);}
		 
		 int tmpkey=0;
		 int tmpvalues=end.get(0); 
		 
				
		for (int i = 1; i < end.size(); i++) {
				if (tmpvalues<end.get(i)) {
					tmpkey=i;
					tmpvalues=end.get(i);
				}
			}			
		return tmpkey+1; 		
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] ar = new int[n];
	        for(int ar_i = 0; ar_i < n; ar_i++){
	            ar[ar_i] = in.nextInt();
	        }
//	    	int n=6;
//	    	int[] ar={1,4,4,4,5,3};
	        int result = migratoryBirds(n, ar);
	        System.out.println(result);
	    }
}
