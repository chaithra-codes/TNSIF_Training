package org.tnsif.acce.c2tc.scannerClass_bufferClass;
import java.util.Scanner;

public class scannerCharDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name: ");
		 char c = scan.next().charAt(1);
		 System.out.println("the character in the name:"+c);
		 scan.close();
		
	}

}
