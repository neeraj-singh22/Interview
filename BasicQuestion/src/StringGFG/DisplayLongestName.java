package StringGFG;

public class DisplayLongestName {

	public static void main(String ar[]) {
		String[] name={ "6",
				"Harsh",
				"Gaurav",
				"GauravMiglani",
				"HarshAgarwal",
				"GeeksforGeeksGeeks",
				"Programmiz" };
	
	    String longest=name[0];
	    
	    for(int i=1; i<name.length; i++) {
	    	if(name[i].length()>longest.length()) {
	    		longest=name[i];
	    	}
	    }
	    System.out.println(longest);
	}
}