import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapExampless {
	public static void main(String ar[]) {
		//<--------------HashMap-------------------------->
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		map.put(null, null);
		map.put("Kunal", null);            //1.Duplicate key not allowed but values Allowed
		map.put("ABhi", 50);               //2.One Null Key is allowed but can have multiple null values 
		map.put("Tannu", 100);             //Did'nt maintain anyOrder


		for(Map.Entry<String,Integer> m:map.entrySet()) {
			//System.out.println(m.getValue());
		}

		//<---------------Tree Map------------------------->
		TreeMap<String,Integer> map1=new TreeMap<String,Integer>();
		//map1.put(null, null);
		map1.put("Kunal", null);         //1.Duplicate key not allowed but values Allowed
		map1.put("ABhi", 50);            //2.Null Key and values are not allowed (Major Diff)
		map1.put("Tannu", 100);          //3.maintain ascending anyOrder


		for(Map.Entry<String,Integer> m:map1.entrySet()) {
			//System.out.println(m.getKey());
		}

		//<---------------Hashtable------------------------->
		Hashtable<String,Integer> table=new Hashtable<String,Integer>();
		//map1.put(null, null);
		table.put("Kunal", 20);         //1.Duplicate key and values both not allowed.(Major Diff)
		table.put("ABhi", 50);          //2.It is Sychronised
		table.put("Tannu", 100);       


		for(Map.Entry<String,Integer> m:map1.entrySet()) {
			System.out.println(m.getKey());
		}
	}
}