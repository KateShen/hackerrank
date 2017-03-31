package hackerrank;

import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
    String input=sc.nextLine();
    int length=input.length();
    
    String period=input.substring(length-2, length);
    String hours=input.substring(0,2);
    String others=input.substring(2,8);
    
    if (period.equals("PM")) {
		if (Integer.parseInt(hours)==12) {
			StringBuffer end=new StringBuffer().append(hours).append(others);
			System.out.println(end);
		}else {
			int fixhour=Integer.parseInt(hours)+12;
			StringBuffer end=new StringBuffer().append(fixhour).append(others);
			System.out.println(end);
		}
	}else{
		if (Integer.parseInt(hours)==12) {
			hours="00";
			StringBuffer end=new StringBuffer().append(hours).append(others);
			System.out.println(end);			
		}else {
			int fixhour=Integer.parseInt(hours);
			StringBuffer end=new StringBuffer().append(fixhour).append(others);
			System.out.println(end);
		}
	}
	}
}
