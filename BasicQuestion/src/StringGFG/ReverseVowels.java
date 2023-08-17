package StringGFG;

public class ReverseVowels {

	public static void main(String[] args) {
		
		String s="the best of both worlds";
		 char[] str = s.toCharArray();
		int i=0,j=s.length();
		
		while(i<j) {
			if(!isVowel(s.charAt(i))) {
				i++;
				continue;
			}
			if(!isVowel(s.charAt(j))) {
				j--;
				continue;
			}
			
			char c=str[i];
			str[i]=str[j];
			str[j]=c;
			i++;
			j--;
			
		
		}
		String s1=String.copyValueOf(str);
		System.out.println(s1);
		
	}
		
		public static boolean isVowel(char x) {
			return(x=='a' || x=='e' || x=='i' || x=='o' || x=='u' ||
				x=='A' || x=='E' || x=='I' || x=='O' || x=='U');
		}
}
