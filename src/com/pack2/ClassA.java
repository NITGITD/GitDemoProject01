package com.pack2;

import java.util.Enumeration;
import java.util.Vector;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ClassA {

	void meth1() {
		System.out.println("Implementing Vector:::");
		Vector v = new Vector();
		v.add(10);
		v.add("java");
		v.add(null);
		v.add(true);
		v.add(10);
		v.add(96);
		v.add(41);
		System.out.println(v);
		System.out.println("Size()::" + v.size());
		System.out.println("Capacity()::" + v.capacity());
		v.add(true);
		v.add(6);
		v.add(26);
		v.add(46);
		System.out.println("Using for loop");
		for (int i = 0; i <= v.size() - 1; i++) {
			System.out.print(v.get(i) + "  ");
		}
		System.out.println();
		System.out.println("Reverse");
		for (int i = v.size() - 1; i >= 0; i--) {
			System.out.print(v.get(i) + "  ");
		}
   
		System.out.println();
		System.out.println("Using Enumeration::");
		Enumeration e=v.elements();
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement()+" ");
		}
		System.out.println();
		System.out.println("Size()::" + v.size());
		System.out.println("Capacity()::" + v.capacity());

	}

	public static void main(String[] args) {
		new ClassA().meth1();

	}

}
