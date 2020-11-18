package com.Sapient.chaining;

public class B extends A {
	int c,d;
	float e;
	
	public B(int a, float b, int c) {
		super(a, b);
		this.c = c;
		System.out.println("This is constructor with single parameter");
	}
	
	public B(int a, float b, int c, int d) {
		this(a,b,c);
		this.d = d;
		System.out.println("This is constructor with double parameter");
	}
	
	public B(int a, float b, int c, int d, float e) {
		this(a,b,c,d);
		this.e = e;
		System.out.println("This is constructor with triple parameter");
	}
	
	
	
	
	

}
