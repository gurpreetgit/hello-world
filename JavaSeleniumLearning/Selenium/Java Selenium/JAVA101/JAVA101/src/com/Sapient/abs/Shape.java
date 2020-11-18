package com.Sapient.abs;

public abstract class Shape {
	
	protected int area;
	
	public Shape()
	{
		super();
	}
	
	abstract public int computeArea();
	
	public final void displayArea(){
		System.out.println("Area is " + area);
	}

}
