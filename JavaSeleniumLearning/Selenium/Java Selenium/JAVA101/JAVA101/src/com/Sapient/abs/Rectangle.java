package com.Sapient.abs;

public class Rectangle extends Shape {
	
	int l,b;

	public Rectangle(int l, int b) {
		super();
		this.l = l;
		this.b = b;
	}

	@Override
	public int computeArea() {
		area = l*b;
		return area;
	}
	
	

}
