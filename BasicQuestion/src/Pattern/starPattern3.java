package Pattern;

public class starPattern3 {   

	public static void main(String[] ar) {

		for(int i=0;i<5;i++) {

			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for(int i=0;i<5;i++) {

			for(int j=5; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
//* 
//* * 
//* * * 
//* * * *
//* * * * * 
//* * * * * * 
//* * * * * 
//* * * * 
//* * * 
//* * 