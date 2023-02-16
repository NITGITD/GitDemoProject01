package Map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ClassB {

	void meth1() {
		System.out.println("Implementing TreeMap...");
		TreeMap<Object, Object> map=new TreeMap<Object, Object>();

		map.put(101, "Java"); //Insertion order is not maintained but sorting order is maintained
		map.put(500, 1000);// Heterogeneous keys are not allowed but Heterogeneous Values are allowed 
		map.put(104, null);// null keys are not allowed but but null values are allowed 
		map.put(109, "Css"); // Duplicate values are allowed
		map.put(105, "Java");// It is available from Java 1.2v
		map.put(102, "Html"); // Its default capacity is 16 [Load factor : 0.75] 
		map.put(102, "Spring"); //Its size increases by DOUBLE
		System.out.println(map);
		map.put(103, "Java");// It is NOT synchronized 		
		System.out.println(map);	
		System.out.println("------------------------------------------------");
		ArrayList<Object> al=new ArrayList<Object>(map.entrySet());
		Iterator<Object> i=al.iterator();
		while(i.hasNext()) {
			Entry e=(Entry)i.next();
			System.out.println(e.getKey()+"   "+e.getValue());
		}
	}
	public static void main(String[] args) {
		
        new ClassB().meth1();
	}

}
