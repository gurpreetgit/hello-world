package com.Sapient.interfaceimplementation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Roadbycycle obj1 = new Roadbycycle(22,3);
		obj1.speedUp(10);
		obj1.display();
		obj1.changeGear(5);
		obj1.display();
		obj1.applyBrakes(4);
		obj1.display();
		
		MountainBycycle obj2 = new MountainBycycle(20,2);
		obj2.speedUp(10);
		obj2.display();
		obj2.changeGear(4);
		obj2.display();
		obj2.applyBrakes(7);
		obj2.display();
		
	}

}
