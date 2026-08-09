package org.tnsif.acce.c2tc.interview_preparation;

import java.util.Scanner;


public class StringConcatenation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		 

		System.out.print("Enter the first string: "); 
		String str1 = scanner.nextLine(); 

		

		System.out.print("Enter the second string: "); 
		String str2 = scanner.nextLine(); 

		

		 String concatenatedString = str1 + str2; 

	

		 System.out.println("The concatenated string is: " + concatenatedString); 

		
		scanner.close();


		

	}

}
