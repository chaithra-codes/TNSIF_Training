package org.tnsif.acce.c2tc.multiple_interface;
class SmartPhone implements Camera,MusicPlayer

{
	@Override
	public void playMusic() {
		System.out.println("Playing music on the smartphone");
		
		
	}

	@Override
	public void takePhoto() {
		System.out.println("Taking photo using smartphone camera");
		
		
	}
}

public class MultiInterface {

	public static void main(String[] args) {
		SmartPhone smartphone=new SmartPhone();
		smartphone.playMusic();
		smartphone.takePhoto();

	}

}


