package hankerrankImplementation;

import java.util.Scanner;

public class appleandorange {
	
	public static void main(String[] args) {
		
	        Scanner in = new Scanner(System.in);
	        int s = in.nextInt();
	        int t = in.nextInt();
	        int a = in.nextInt();
	        int b = in.nextInt();
	        int m = in.nextInt();
	        int n = in.nextInt();
	        int[] apple = new int[m];
	        for(int apple_i=0; apple_i < m; apple_i++){
	            apple[apple_i] = in.nextInt();
	        }
	        int appnum=0;
	        int oranum=0;
	        for(int i=0;i<apple.length;i++){
	        	int x=apple[i]+a;
	        	if (x<=t && x>=s) {
					appnum++;
				}
	        }
	        System.out.println(appnum);
	        int[] orange = new int[n];
	        for(int orange_i=0; orange_i < n; orange_i++){
	            orange[orange_i] = in.nextInt();
	        }
	        for(int i=0;i<orange.length;i++){
	        	int x=orange[i]+b;
	        	if (x<=t && x>=s) {
					oranum++;
				}
	        }
	        System.out.println(oranum);
	    }
}
