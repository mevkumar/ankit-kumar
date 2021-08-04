package com.ankit;

import java.util.Scanner;

public class Calculator implements IMath {

	@Override
	public void Add() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("Addition="+c);

	}

	@Override
	public void Sub() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a-b;
		System.out.println("Addition="+c);


	}

	@Override
	public void Mul() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a*b;
		System.out.println("Addition="+c);


	}

	@Override
	public void Div() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a/b;
		System.out.println("Addition="+c);


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		c.Add();
		c.Sub();
		c.Mul();
		c.Div();

	}

}
