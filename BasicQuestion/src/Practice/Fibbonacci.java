package Practice;

//Next number is the sum of first two number
public class Fibbonacci {

	public static void main(String ar[]) {
		int n1=0,n2=1,n3,i,count=15;
		
		System.out.print(n1+" ");
		System.out.print(n2+" ");
		
		for(i=2;i<count;i++) {
			
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	}
}
