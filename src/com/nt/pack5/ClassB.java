package com.nt.pack5;

import java.util.PriorityQueue;

public class ClassB {

	void meth() {
	  System.out.println("implementing PriorityQueue::");
	  PriorityQueue<Object> pq=new PriorityQueue<Object>();
	  pq.add(100);
	  pq.offer(200);
	 // pq.add("java");
	//  pq.add(null);
	// pq.add(true);
	  pq.add(85);
	  pq.add(5);
	  pq.add(100);
	  pq.add(10);
	  pq.add(99);
	  pq.add(8);
	  System.out.println(pq);
	  System.out.println("remove()::"+pq.remove());
	  System.out.println(pq);
	  System.out.println("poll()::"+pq.poll());
	  System.out.println(pq);
		/*pq.clear();
		System.out.println("remover()::"+pq.remove());
		 System.out.println("poll()::"+pq.poll());
		*/
	  System.out.println("peek()::"+pq.peek());
	  System.out.println(pq);
	  }
	public static void main(String[] args) {
		
     new ClassB().meth();
	}

}
