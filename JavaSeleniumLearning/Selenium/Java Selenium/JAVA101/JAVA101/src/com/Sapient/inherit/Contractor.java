package com.Sapient.inherit;

public class Contractor extends Employee {
	
	private int inc = 5000;
	
public void incSalary(){
	
	salary = salary+inc;
	System.out.println("New salary is " + salary);
		
	}

public void displayNewSalary(){
	System.out.println("Salary incremented  by " + inc);
	System.out.println("New salary is " + salary);
}

public void compareSalary(Employee obj){
	if(this.getSalary()>obj.getSalary())
	{
		System.out.println(this.getName() + "has higher salary then " + obj.getName());
	}
	else
	{
		System.out.println(obj.getName() + "has higher salary then " + this.getName());
	}
}

}
