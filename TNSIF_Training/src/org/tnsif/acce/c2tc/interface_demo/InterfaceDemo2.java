package org.tnsif.acce.c2tc.interface_demo;

class InterfaceDemo  implements SmartDevice
{

	

	

	@Override
	public void turnOn() {
		System.out.println("SmartLight is On");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Smartlight is off");
	}
		

	@Override
	public void getStatus() {
		System.out.println("SmartLight is standbymode");
		
	}
}
		
	

public class InterfaceDemo2 
		{
			public static void main(String[] args) {
				SmartDevice smart=new InterfaceDemo();
				smart.turnOn();
		        smart.turnOff();
		        smart.getStatus();
			}
		}
	