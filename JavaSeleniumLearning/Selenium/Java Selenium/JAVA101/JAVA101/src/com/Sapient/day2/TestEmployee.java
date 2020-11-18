package com.Sapient.day2;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Employee e1 = new Employee();
		e1.setEmpId(1001);
		e1.setEmpName("Ashish");
		Address add = new Address(); 
		e1.setAdd(add);
		add.setHno(2206);
		add.setCity("Ggn");
		add.setPin(122116);
		e1.display();*/
		
		Employee e1 = new Employee(12345, "Ashihs");
		e1.settingAddress(2206, "ggn", 122016);
		e1.display();

	}

}
