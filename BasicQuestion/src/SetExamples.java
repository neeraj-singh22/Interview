import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetExamples {
	public static void main(String ar[]) {
		//<--------------HashSet-------------------------->
		Set<Integer> set=new HashSet<Integer>() ;
		set.add(null);
		set.add(null);
		set.add(2);
		set.add(3);                  //1.One Null Allowed
		set.add(31);                 //2.InsertionOrder not maintained
		set.add(327);                //3.Uses hashing mechanism for storage
		set.add(3876);               //4.No Duplicate
		for(Integer s1:set) {
			//System.out.println(s1);
		}
		//<---------------Linked HashSet------------------->
		Set<Integer> set1=new LinkedHashSet<Integer>() ;
		set1.add(null);
		set1.add(null);
		set1.add(2);
		set1.add(3);                 //1.One Null Allowed
		set.add(31);                 //2.InsertionOrder maintained(Major Difference) 
		set.add(327);                //3.Uses HashTable and LinkedList for storage
		set.add(3876);               //4.No Duplicate
		for(Integer s2:set1) {
			//System.out.println(s2);
		}
		
		//<---------------Tree Set------------------------>
		SortedSet<Integer> set2=new TreeSet<Integer>();
		//set2.add(null);
		set2.add(23);                //1.No Null Allowed
		set2.add(25);                //2.Maintain Ascending Order
		set2.add(2);                 //3.
		Iterator<Integer> itr=set2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}