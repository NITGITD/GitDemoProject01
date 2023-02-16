package com.pack1;

import java.util.ArrayList;
import java.util.Iterator;

public class ClassB {
     void meth1() {
    	 System.out.println("Passing User Defined object into collection class ");
    	 ArrayList<ClassC> al=new ArrayList<ClassC>();
    	 ClassC aobj1=new ClassC("Abhishek",101,"java");
    	 ClassC aobj2=new ClassC("Vibhor",102,"Spring");
    	 ClassC aobj3=new ClassC("Sumit",103,"Spring Boot");
        al.add(aobj1);
        al.add(aobj2);
        al.add(aobj3);
        al.add(new ClassC("Sumant",104,"FullStackJava"));
        System.out.println(al);
        System.out.println();
        System.out.println("Reterving the data By using Iterator");
        Iterator<ClassC> i=al.iterator();
        while(i.hasNext()) {
        	System.out.println(i.next());
        }
        System.out.println("Reterving the data in reverse ");
        for(int a=al.size()-1;a>=0;a--) {
        	System.out.println(al.get(a));
        }

     }
	public static void main(String[] args) {
		new ClassB().meth1();

	}

}
