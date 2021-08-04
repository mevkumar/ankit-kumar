package com.ankit;

public class P {
     P() {
		System.out.println("I am in P");
	}

}
 class B extends P{
	B() {
		 System.out.println("I am in B");
	 }
	
//	void show() {
//		
//		super.m1();
//		m1();
//		super.m1();
//	}

	public static void main(String[] args) {
		B b=new B();
	//	b.show();
	}

}
