package com.nt.pack5;

import java.util.LinkedList;
import java.util.List;

public class ClassA {

	void meth1() {
		System.out.println("Implementing Queue");
		List<Object> li=new LinkedList<Object>();
		LinkedList<Object> ll=new LinkedList<Object>();
		li.add(10);
		//li.offer(20);
		ll.add(100);
		ll.offer(200);
		System.out.println(li);
		System.out.println(ll);
	}
	public static void main(String[] args) {
		new ClassA().meth1();

	}

}
