package Pattern;

public class starPattern4 {   

	public static void main(String[] ar) {
		int n=5;
		for(int i=n;i>0;i--) {
			
			for(int j=i; j<=n; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}
//5
//45 
//345 
//2345
//12345