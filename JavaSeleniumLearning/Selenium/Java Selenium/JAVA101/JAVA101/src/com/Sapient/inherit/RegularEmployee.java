package com.Sapient.inherit;

public class RegularEmployee extends Employee {
	
	private int incPercent;
	
	public RegularEmployee(int incPercent) {
		super();
		this.incPercent = incPercent;
	}

	public void incSalary(){
		
		salary = salary+ ((salary*incPercent)/100);
		System.out.println("New salary is " + salary);
			
		}

	public void displayNewSalary(){
		System.out.println("Salary incremented  by " + incPercent + "%");
		System.out.println("New salary is " + salary);
	}


}
