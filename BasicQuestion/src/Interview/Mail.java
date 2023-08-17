package Interview;


public class Mail {

	public static void main(String ar[]) {
		
		String s="Nrjsingh622@gmail.com";
		
		String num=s.replaceAll("[^0-9]", "");
		int number=Integer.parseInt(num);
		int newNum=0;
		
		while(number!=0) {
			int digit=number%10; 
		    newNum=newNum+digit; 
			number=number/10;
		}
		System.out.println(newNum);
	}
}