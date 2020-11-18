package com.Sapient.day2;

public class Address {
	
	private int hno;
	private String city;
	private int pin;
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public void displayAddress(){
		System.out.println("H No is " + hno);
		System.out.println("City is " + city);
		System.out.println("PIN is " + pin);
	}

}
