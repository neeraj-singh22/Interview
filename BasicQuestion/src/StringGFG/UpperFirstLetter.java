package StringGFG;

public class UpperFirstLetter {

	public static void main(String[] ar){
	    {
	    	StringBuffer sf=new StringBuffer();
	        String str ="neeraj is daddy";
	        String[] upper=str.split(" ");
	        
	        for(int i=0;i<upper.length;i++) {
	        	char c=upper[i].charAt(0);
	        	char upperChar=Character.toUpperCase(c);
	        	System.out.println(upperChar);
	        	
	        	
	        }
	        System.out.println(sf);
	    } 
	}
}