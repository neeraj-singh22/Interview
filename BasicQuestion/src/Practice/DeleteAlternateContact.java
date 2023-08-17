package Practice;

import java.util.Arrays;

public class DeleteAlternateContact {

	
	    static String delAlternate(String S) {
			String s = "";
			for(int i=0;i<S.length();i++) {
				if(i%2==0) {
					s+=S.charAt(i);
				}
			}
			System.out.println(s);
			return s;
	    }
	   public static void main(String[] args) {
	       System.out.println(delAlternate("Selenium"));;
	}
	}


