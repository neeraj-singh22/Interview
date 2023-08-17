package Practice;

public class CountCamelCase {

	public static void main(String[] args) {
		int count=0;
		String x="bxchjdbjabnjKNNXNMLcKK";
		for(int i=0;i<x.length();i++) {
			if(x.charAt(i)>=65 && x.charAt(i)<=90) {
				count++;
			}
		}
		System.out.println(count);
	}

}