package Interview;

public class ReverseAlternative {
    
    public static void main(String ar[]) {
    	String longName="My Name Is Neeraj";
    	
    	String[] words=longName.split(" ");
    	
        StringBuffer newStr=new StringBuffer(); 
    	
    	for(int i=0;i<words.length;i++) {
    		if(i%2!=0) {
    			newStr.append(" "+new StringBuffer(words[i]).reverse());
    		}
    		else {
    			newStr.append(" "+words[i]);
    		}
    	}
    	System.out.println(newStr.toString().trim());
    }
}