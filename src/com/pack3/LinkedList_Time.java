package com.pack3;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_Time {

	private static Object arr [];
	{
		arr=new Object[100000];
		for(int i=0;i<arr.length;i++) {
			arr[i]=new Object();
		}		
	}
	void ArrayListTime() {
		long start,end;
		ArrayList<Object> al=new ArrayList<Object>();
		start=System.currentTimeMillis();
		for(Object obj1:arr) {
			al.add(obj1);
		}
		end=System.currentTimeMillis();
		System.out.println("ArrayList Costruction Time::"+(end-start));
	}
	void LindedListTime() {
		long start,end;
		LinkedList<Object> ll=new LinkedList<Object>();
		start=System.currentTimeMillis();
		for(Object obj2:arr) {
			ll.add(obj2);
		}
		end=System.currentTimeMillis();
		System.out.println("LinkedList Costruction Time::"+(end-start));
	}
	void meth1() {
		for(Object o:arr) {
			System.out.println(o);
		}
	}
	
	public static void main(String[] args) {
		LinkedList_Time lt=new LinkedList_Time();
		lt.ArrayListTime();
		lt.LindedListTime();
		//lt.meth1();

	}

}
