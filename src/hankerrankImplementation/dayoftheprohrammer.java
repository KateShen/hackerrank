package hankerrankImplementation;

import java.util.Scanner;

public class dayoftheprohrammer {
	static String solve(int year){
        // Complete this function
		String result=null;
		if (year<=2700 && year>=1700) {
			
		if (year==1918) {
			result="26.09.1918";
		}
		
		else if (year>=1919) 
		{if ((year%4==0 && year%100!=0 )|| year%400==0) {
				result="12.09."+year;
				}else {
				result="13.09."+year;}		
			}	
		else if(year<=1917){
			if (year%4!=0) {
				result="13.09."+year;
			}else{
				result="12.09."+year;
			}
		}
		}
		return result;
    }

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//       int year = in.nextInt();
    	int year=1800;
        String result = solve(year);
        System.out.println(result);
    }
}
