package Practice;

public class ReverseString {
	
	public static void main(String ar[]) {
	
		String name="Simran Verma";
		
		int len=name.length();
		
		String rev="";
		
		for(int i=len-1; i>=0; i--) {
			rev = rev + name.charAt(i);  
		}
		
		System.out.println(rev);
	
	//String Buffer
	StringBuffer sf=new StringBuffer(name);
	StringBuffer bufferReverse=sf.reverse();
	System.out.println(bufferReverse);
	
	}
}