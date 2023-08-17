package StringGFG;

public class CheckForBinary {

	public static void main(String ar[]) {
		String num="223654";
		boolean flag;
		
		for(int i=0; i<num.length(); i++) {
			if(num.charAt(i)==0 || num.charAt(i)==1) {
				flag=true;
				break;
			}
			
		}
		if(flag=true) {
			System.out.println("1");
		}
		else {
			System.out.println(0);
		}
	}
}
