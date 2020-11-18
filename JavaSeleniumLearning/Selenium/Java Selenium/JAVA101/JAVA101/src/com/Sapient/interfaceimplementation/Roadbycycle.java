package com.Sapient.interfaceimplementation;

public class Roadbycycle extends MainBycycle {

	public Roadbycycle(int speed, int gear) {
		super(speed, gear);


	}
	
	@Override
	public int applyBrakes(int dec) {
		speed=speed-dec;
		return 0;
	}

	@Override
	public int speedUp(int inc) {
		speed = speed+inc;
		return 0;
	}

	@Override
	public int changeGear(int number) {
		gear=number;
		return 0;
	}


}
