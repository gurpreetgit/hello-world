package com.Sapient.interfaceimplementation;

public abstract class MainBycycle implements Bycycle,Testing   {
	
	protected int speed;
	protected int gear;
	
	

	public MainBycycle(int speed, int gear) {
		super();
		this.speed = speed;
		this.gear = gear;
	}

	@Override
	public int applyBrakes(int dec) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int speedUp(int inc) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int changeGear(int number) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void display(){
		System.out.println("Speed is " + speed);
		System.out.println("Gear is " + gear);
	}

}
