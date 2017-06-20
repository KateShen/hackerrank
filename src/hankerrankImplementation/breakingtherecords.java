package hankerrankImplementation;

import java.util.Scanner;

public class breakingtherecords {
	static int[] getRecord(int[] s){
	
	int max=0;
	int min=0;
	int[] result={max,min};
	int standard=s[0];
	int bignum=standard;
	int smlnum=standard;
	for (int i = 1; i < s.length; i++) {
		if (s[i]<=100000000 && s[i]>=0 && s.length<=1000 && s.length>=1) {
			
		
		if (s[i]>standard) {
			if (s[i]>bignum) {
				bignum=s[i];
				if (s[i-1]<s[i]) {
					max++;
				}
			}
		}
		else if (s[i]<standard) {
			if (s[i]<smlnum) {
				smlnum=s[i];
			if (s[i]<s[i-1]) {
				min++;
			}			
		}
			}
		
		}
	}
	result[0]=max;
	result[1]=min;
	return result;
        // Complete this function
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] s = new int[n];
//        for(int s_i=0; s_i < n; s_i++){
//            s[s_i] = in.nextInt();
//        }
    	int[] s={100,45,41,60,17,41,45,43,100,40,89,92,34,6,64,7,37,81,32,50};
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
