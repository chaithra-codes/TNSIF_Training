package org.tnsif.acce.c2tc.interface_demo1;

class SmartLight implements SmartDevice
{
	@Override
	public void turnon() {
		System.out.println("Smart light is turnon");
	}

	@Override
	public void turnoff() {
		System.out.println("Smart light is turn off");
		
	}

	@Override
	public void gerStatus() {
		System.out.println("Smart light is stand by mode");
	}	




public class InterfaceDemo {

	public static void main(String[] args) {
		SmartDevice obj = new SmartLight();
		obj.turnon();
		obj.turnoff();
		obj.gerStatus();
	}

}


}
