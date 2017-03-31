package hackerrank;

import java.util.HashMap;
import java.util.Scanner;

public class BirthdatCakeCandles {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
		
//		int n=4;
//		int height[] = {3,2,1,3};
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        int Max_wang = 0;
        HashMap<Integer, Integer> candle=new HashMap<>();
        for(int i=0;i<n;i++){
        	if(Max_wang < height[i]){
        		Max_wang = height[i];
        	}
        	if (candle.containsKey(height[i])) {
				candle.replace(height[i], candle.get(height[i])+1);
        	} else {
				candle.put(height[i],1);
			}
        }
        //System.out.println(candle.toString());

        
        System.out.println(candle.get(Max_wang));
    }
}
