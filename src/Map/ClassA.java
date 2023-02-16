package Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;

public class ClassA {

	void meth1() {
		System.out.println("Implementing HashSet...");
		HashMap<Object, Object> map=new HashMap<Object, Object>();
		map.put(101, "Java"); 
		map.put("Java", 1000);// Heterogeneous keys & Values are allowed
		map.put(null, null);// null keys & values are allowed
		map.put(109, "Css"); // Duplicate values are allowed
		map.put(105, "Java");
		map.put(102, "Html"); // Its default capacity is 16 [Load factor : 0.75] 
		map.put(102, "Spring"); //Its size increases by DOUBLE
		System.out.println(map);
		map.put("java", "java");
		HashSet<Object> set=new HashSet<Object>(map.keySet());
		System.out.println("Key's present in map::"+set);
		Iterator<Object> i=set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		HashSet<Object> set1=new HashSet<Object>(map.entrySet());
		Iterator<Object> i2=set1.iterator();

		System.out.println("----------------------------------");
		while(i2.hasNext()) {
			Entry e=(Entry)i2.next();
			System.out.println(e.getKey()+"    "+e.getValue());
		}
		System.out.println("----------------------------------");

		LinkedHashSet<Object> ll1=new LinkedHashSet<Object>(map.entrySet());
		Iterator<Object> i3=ll1.iterator();

		while(i3.hasNext()) {
			Entry e=(Entry)i3.next();
			System.out.println(e.getKey()+"    "+e.getValue());
		}
		
		
	}
	public static void main(String[] args) {
		
   new ClassA().meth1();
	}

}
