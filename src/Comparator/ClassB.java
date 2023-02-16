package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ClassB {

	void meth1() {
		System.out.println("Implementing Cmparable");
		ArrayList<ClassA> al = new ArrayList<ClassA>();
		ClassA aobj1=new ClassA("Kishan",101,"Java");
		ClassA aobj2=new ClassA("Afroze",109,"Spring");
		ClassA aobj3=new ClassA("Rachel",105,"UI");
		al.add(aobj1);
		al.add(aobj2);
		al.add(aobj3);
		Iterator<ClassA> i=al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("-----------------------------------------");
		Collections.sort(al,new ClassC());
		Iterator<ClassA> i2=al.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		

		/*int arr[]= {8,4,7,2,6,9,3,1,5};
		System.out.println("Before Sorting::"+Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("After Sorting::"+Arrays.toString(arr));
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(11);
		al.add(55);
		al.add(44);
		al.add(77);
		al.add(11);
		al.add(99);
		al.add(33);
		al.add(11);
		System.out.println("Before Sorting::"+al);
		Collections.sort(al);
		System.out.println("After Sorting::"+al);
		System.out.println("-----------------------------------------");
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(15);
		hs.add(95);
		hs.add(35);
		hs.add(55);
		hs.add(5);
		hs.add(75);
		System.out.println("Before Sorting::"+hs);
		ArrayList<Integer> al2= new ArrayList<Integer>(hs);
		Collections.sort(al2);
		System.out.println("After Sorting::"+al2);*/
	}

	public static void main(String[] args) {
		new ClassB().meth1();

	}

}
