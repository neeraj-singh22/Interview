package Practice;

public class CountCharacter {

	public static void main(String[] args) {
		int count=0;
		int x=345678;
		while(x!=0) {
			x=x/10;
			count++;
		}
		System.out.println(count);
	}

}