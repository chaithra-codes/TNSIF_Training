package org.tnsif.acce.c2tc.interface_demo1;

class EmailNotification implements NotificationService
{

	@Override
	public void notifyUser(String message) {
		System.out.println("Sending Email: "+message);
		
	}
	
}
class SMSNotification implements  NotificationService
{
	@Override
	public void notifyUser(String message) {
		
		System.out.println("Sending sms: "+message);
	}


public class FunctiolInterfaceDemko {

	public static void main(String[] args) {
		NotificationService email =new EmailNotification();
		NotificationService sms =new SMSNotification();
		email.notifyUser("Assignment Uploaded");
		sms.notifyUser("class at 10am");
		

	}

}



}
