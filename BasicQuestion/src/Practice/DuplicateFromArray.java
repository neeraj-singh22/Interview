package Practice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateFromArray {
	
	public static void main(String ar[]) {
	
		String name[]={"Simran", "Neeraj", "Kunal", "Psycho", "Akshay", "Kunal", "Akshay" };
		
		for(int i=0; i<name.length; i++) { //Kunal 2
			
			for(int j=i+1; j<name.length; j++) {
				if(name[i].equals(name[j])) {
					System.out.println(name[i]);
				}
			} 
		}
	
	Set<String> store=new HashSet<String>(); {
		
		for(String duplicate:name) {
			if(store.add(duplicate)==false) {
				System.out.println(duplicate);
			}
		}
	};
}
}
