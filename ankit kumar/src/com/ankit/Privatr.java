package com.ankit;

public class Privatr {
	
	
	void M() {
		System.out.println("M1 is here");
	}
}
	class B1 extends Privatr{{}}
	class A{

	public static void main(String[] args) {
		B1 b=new B1();
		b.M();
		

	}

}
