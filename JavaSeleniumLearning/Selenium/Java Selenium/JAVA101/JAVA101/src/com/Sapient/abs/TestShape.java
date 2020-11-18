package com.Sapient.abs;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape obj1 = new Rectangle(4,6);
		System.out.println("Area printed in main method is " + obj1.computeArea());
		obj1.displayArea();
		
		Circle obj2 = new Circle(4);
		System.out.println("Area of circle printed in main method is " + obj2.computeArea());
		obj2.displayArea();
		
		

	}

}
