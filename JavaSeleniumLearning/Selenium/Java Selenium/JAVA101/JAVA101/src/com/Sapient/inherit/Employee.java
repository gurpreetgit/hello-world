package com.Sapient.inherit;

public class Employee {
	
	protected int empId;
	protected String name;
	protected int salary;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	protected void display(){
		System.out.println("Name is " + name);
		System.out.println("Emp id is "+ empId);
		System.out.println("Salary is "+ salary);
	}
	
	protected void incSalary(){
		
	}
	
	public void compareSalary(Employee obj){
		System.out.println("This is a test method for polymorphism");
	}

}
