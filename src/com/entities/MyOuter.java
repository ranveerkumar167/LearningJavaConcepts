package com.entities;

public class MyOuter {

	private int x;
	
	MyInner myInner = new MyInner();
	
	public void doStuff() {
		myInner.go();
	}
	
	class MyInner {
		void go() {
			x = 42;
			System.out.println(x);
		}
	}
	
}
