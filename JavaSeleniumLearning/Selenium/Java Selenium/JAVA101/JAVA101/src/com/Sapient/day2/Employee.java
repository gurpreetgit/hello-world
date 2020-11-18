package com.Sapient.day2;

public class Employee {
	
	private int empId;
	private String empName;
	Address add; 	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.add = new Address();
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void settingAddress(int hno, String city, int pin){
		add.setHno(hno);
		add.setCity(city);
		add.setPin(pin);
	}
	
	public void display(){
		System.out.println(" Emp ID is " + empId);
		System.out.println("Emp name is"  + empName);
		add.displayAddress();
	}
	
}
