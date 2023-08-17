package Practice;

public class CountDigit {

	public static void main(String[] args) {
		int count=0;
		String x="The best of both worlds";
		for(int i=0;i<x.length();i++) {
			if(x.charAt(i)!=' ') {
			count++;
			}
		}
		System.out.println(count);
	}

}