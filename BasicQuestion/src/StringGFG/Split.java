package StringGFG;

public class Split {

	public static void main(String ar[]) {
		String fullName="Neeraj Kumar   ";
		String[] nameArray=fullName.split(" ");
		
			System.out.println(nameArray[0]);
			System.out.println(nameArray[1]);
			System.out.println(fullName.trim());
		
	}
}
