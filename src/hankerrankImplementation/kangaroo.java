package hankerrankImplementation;

import java.util.Scanner;

public class kangaroo {
	static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
		 if (x1<x2 && x1>=0 && x2<=10000 && v1<=10000 && v1>=1 && v2<=10000 && v2>=1 ) {
			if ((x1>x2 && v1<v2) || (x1<x2 && v1>v2)) {
				for (int i = 0; ; i++) {
					if (x1+i*v1-x2-i*v2>0 && x1+(i+1)*v1-x2-(i+1)*v2<0) {
						return "NO";
					}
					else if (x1+i*v1-x2-i*v2<0 && x1+(i+1)*v1-x2-(i+1)*v2>0) {
						return "NO";						
					}
					else if (x1+i*v1-x2-i*v2==0) {
						return "YES";
					}
				}
			}else {
				return "NO";
			}
		}
		 else {
			return "NO";
		}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
