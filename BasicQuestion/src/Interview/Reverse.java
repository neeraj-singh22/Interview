package Interview;

public class Reverse {
    
    public static void main(String ar[]) {
    	String longName="My Name Is Neeraj";
    	
    	String[] words=longName.split(" ");
    	
        StringBuffer newStr=new StringBuffer();
    
        for(int i=0;i<words.length;i++) {
        	
        newStr.append(" "+new StringBuffer(words[i]).reverse());
        }
        System.out.println(newStr);
    
        //2 Way
    String s="";
    for(int i=0;i<words.length;i++) {
    	
    	String word=words[i];//My
    	
    	for(int j=word.length()-1;j>=0;j--) {
    		s=s+word.charAt(j);
    	}
    	s=s+" ";
    }
    System.out.println(s);
}}