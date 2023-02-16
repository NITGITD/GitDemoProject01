package com.pack3;

import java.util.Iterator;
import java.util.LinkedList;

public class ClassB {

	void meth1() {
		System.out.println(" Implementin LinkedList...");
		LinkedList<ClassA> ll = new LinkedList<ClassA>();
		ClassA obj1 = new ClassA(101, "Sumant", 20000.2);
		ClassA obj2 = new ClassA(102, "Abhishek", 34000.2);
		ClassA obj3 = new ClassA(103, "Vibhor", 23000.2);
		ClassA obj4 = new ClassA(104, "Sumit", 35000.2);
		ll.add(obj1);
		ll.add(obj2);
		ll.add(obj3);
		ll.add(obj4);
		ll.add(new ClassA(105, "Lucky", 34000.00));
		System.out.println(ll);
		for (int i = ll.size() - 1; i >= 0; i--) {
			System.out.println(ll.get(i));
		}
		System.out.println();
		System.out.println("Reteriving the data by using Iterator..");
       Iterator i=ll.iterator();
       while(i.hasNext()){
       System.out.println(i.next());
       }
	}

	public static void main(String[] args) {
		new ClassB().meth1();

	}

}
