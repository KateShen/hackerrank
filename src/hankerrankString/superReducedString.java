package hankerrankString;

import java.util.ArrayList;
import java.util.Scanner;

public class superReducedString {
	static String super_reduced_string(String s){	
        // Complete this function
		String result="Empty String";
		ArrayList<String> wordlist=new ArrayList<>();
		for(int i=0;i<s.length();i++){
			wordlist.add(s.substring(i,i+1));
		}

		for(int j=0;j<wordlist.size()-1;){
			if (wordlist.get(j).equals(wordlist.get(j+1))) {
				wordlist.remove(j);
				wordlist.remove(j);
					j=0;
			}else {
				j++;
			}
		}
		if (wordlist.size()!=0) {
			result = wordlist.get(0);

			for(int k=1;k<wordlist.size();k++){
			 result+=wordlist.get(k);
			}
		}
		
		return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
    	//String s="abbaccdd";
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
