package Practice;

import java.util.Arrays;

public class ConvertArrayToString {

	public static void main(String[] args) {
		
		//1 way using Arrays.toString Method
		String[] ar= {"Neeraj","kunal","dinak"};
		String news=Arrays.toString(ar);
		
		System.out.println(news);
	
		//2Using join method of string
		System.out.println(String.join(" ",ar));
		
	}
}

