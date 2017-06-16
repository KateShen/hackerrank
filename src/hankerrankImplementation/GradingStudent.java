package hankerrankImplementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GradingStudent {

    static int[] solve(int[] grades){
        int[] output = new int[grades.length];
        // Complete this function
		if(grades.length<=60){
		for(int i=0;i<grades.length;i++){
			if (grades[i]<=100 && grades[i]>=0) {
				if(grades[i]>=38){
					int num=grades[i];
					if (num%10<=5) {
						if (5-num%10<3 && 0<5-num%10) {
							int num1=(num/5+1)*5;
							output[i]=num1;
						}
						else if(5-num%10>=3 || num%10==5 || num%10==0){
							output[i]=grades[i];
						}
						
					}	
					else if(num%10>5){
						if (10-num%10<3) {
							output[i]=(num/10+1)*10;
						}
						else if(10-num%10>=3){
							output[i]=grades[i];
						}
					}
				}
				else if(grades[i]<38){
					output[i]=grades[i];
				}
			}
		}
		}
		return output;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
//        int[] grades={98};
//        int[] result=solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
        

    }
}