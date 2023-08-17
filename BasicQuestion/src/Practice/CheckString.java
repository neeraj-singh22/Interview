package Practice;

public class CheckString {

	public static void main(String[] args) {
		int result=0;
		String s="EEEEEEEEEEEEE2EEEEEEEE";
		String[] s1=s.split("");
	int i=0;
	for(int j=1;j<s.length();j++) {
		if(s1[i]!=s1[j]) {
			break;	
		}
		result=1;
	}
	
	
	if(result==0) {
		System.out.println("String");
	}else {
		System.out.println("Not String");
	}
}
}