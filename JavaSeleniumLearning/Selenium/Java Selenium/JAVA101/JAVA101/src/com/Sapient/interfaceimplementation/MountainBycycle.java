package com.Sapient.interfaceimplementation;

public class MountainBycycle extends MainBycycle {

	public MountainBycycle(int speed, int gear) {
		super(speed, gear);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int applyBrakes(int dec) {
		speed=speed-1;
		return 0;
	}

	@Override
	public int speedUp(int inc) {
		speed = speed+1;
		return 0;
	}

	@Override
	public int changeGear(int number) {
		gear=gear+number;
		return 0;
	}


	
	

}
