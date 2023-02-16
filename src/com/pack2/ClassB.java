package com.pack2;

import java.util.LinkedList;
import java.util.ListIterator;

public class ClassB {

	void meth1() {
		System.out.println("Implementing LinkedList::");
		LinkedList  ll=new LinkedList();
		ll.add(10);
		ll.add("java");
		ll.add(null);
		ll.add(true);
		ll.add(1);
		ll.add(85);
		ll.add(56);
		ll.add(10);
		ll.add(44);
		ll.add(65);
		System.out.println(ll);
		System.out.println("_______________");
		System.out.println("Reterving using for each::");
		for(Object o:ll) {
			System.out.print(o+"  ");
		}
		System.out.println("_______________");
		System.out.println("Reterving using List Iterator");
		ListIterator  li=ll.listIterator();
		while(li.hasNext()) {
			System.out.print(li.next()+"  ");

		}

		System.out.println();
		while(li.hasPrevious()) {
			System.out.print(li.previous()+"  ");
		}
      System.out.println();
      System.out.println("___________");
      System.out.println("____________");
      ll.remove((Object)56);
      System.out.println(ll);
     System.out.println(ll.getFirst());
     System.out.println(ll.getLast());
     ll.addFirst("Java Is Awesome");
     ll.addLast(true);
     System.out.println(ll);
		
	}
	public static void main(String[] args) {
		new ClassB().meth1();

	}

}
