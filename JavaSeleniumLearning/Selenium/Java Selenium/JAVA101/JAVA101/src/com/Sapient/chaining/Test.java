package com.Sapient.chaining;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B obj = new B(1,2.2f,3,4,5.5f);
		A obj2 = new A(1,2);
		A obj3 = (A) obj;
		//B obj4 = (B) obj3;
		
		if (obj2 instanceof B) 
		{A obj4 = obj2;
		System.out.println("Done");}
		
		else
			System.out.println("Fail");
	}
		
		
		
		

	}

