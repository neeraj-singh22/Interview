package StringGFG;

public class RemoveSpaces {

	public static void main(String[] ar) {
	 String s="My name is Neeraj";
	 String str=" ";
	 for(int i=0; i<s.length();i++) {
		 if(s.charAt(i)!=' ') {
			 str+=s.charAt(i);
		 }
	 }
	 System.out.println(str);
}
}