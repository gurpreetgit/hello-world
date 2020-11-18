package com.Sapient.inherit;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contractor obj1 = new Contractor();
		//Employee obj1 = new Contractor();
		obj1.setEmpId(123);
		obj1.setName("Ashish");
		obj1.setSalary(3000);
		obj1.display();
		obj1.incSalary();
		//obj1.displayNewSalary();

		RegularEmployee obj2 = new RegularEmployee(10);
		obj2.setEmpId(124);
		obj2.setName("Amit");
		obj2.setSalary(5000);
		obj2.display();
		obj2.incSalary();
		obj2.displayNewSalary();
		
		
		
		
		
	}

}
