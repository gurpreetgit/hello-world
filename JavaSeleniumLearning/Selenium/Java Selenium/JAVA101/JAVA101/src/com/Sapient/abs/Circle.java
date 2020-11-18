package com.Sapient.abs;

public final class Circle extends Shape{
	
	int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	@Override
	public int computeArea() {
		area= (int) (3.14*radius*radius);
		return area;
	}
	
	

}
