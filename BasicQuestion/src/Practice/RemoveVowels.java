package Practice;

import java.util.HashSet;
import java.util.Set;

public class RemoveVowels {

	public static void main(String[] args) {
		
		String x="the best of both worlds";
		String s="";
		for(int i=0;i<x.length();i++) {
			if(x.charAt(i)!='a' || x.charAt(i)!='e' || x.charAt(i)!='i' || x.charAt(i)!='o' || x.charAt(i)!='u') {	
				s+=x.charAt(i);	
			}
//			else {
//			s+=x.charAt(i);	
//			}
		}
		System.out.println(s);
	}
}