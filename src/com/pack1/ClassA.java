package com.pack1;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassA {

	void meth1() {
		System.out.println("Implementing ArrayList");
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		//al.add("java");
		al.add(null);
		//al.add('A');
		al.add(85);
		al.add(10);
		al.add(96);
        System.out.println(al);
        System.out.println("Size()::"+al.size());
        System.out.println("get()::"+al.get(1));
        System.out.println();
        System.out.println("Reteriving the data in forward direction");
        for(int i=0;i<=al.size()-1;i++) {
        	System.out.print(al.get(i)+"  ");
        }
        System.out.println();
        System.out.println("Reteriving the data in reverse direction");
        for(int i=al.size()-1;i>=0;i--) {
        	System.out.print(al.get(i)+"  ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Reterving the data by using for each loop");
        for(Integer o:al) {
        	System.out.print(o+"  ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Reterving the data by using Iterator::");
        Iterator  i=al.iterator();
        while(i.hasNext()) {
        	System.out.print(i.next()+"  ");
        }
        System.out.println("____________________");
        //al.clear();
        System.out.println(al.isEmpty());
        System.out.println(al.contains(96));
        System.out.println(al.remove((Integer)96));
        System.out.println(al.remove(al.size()-2));
        System.out.println(al);
        al.add(0, 999);
        System.out.println(al);
        

	}
	public static void main(String[] args) {
		new ClassA().meth1();
	}
}
