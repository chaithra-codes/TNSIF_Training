package org.tnsif.acce.c2tc.exceptionhandling;

public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		int number_one=50/5; //10
		System.out.println(number_one);
		int number_two=50/10; //10
		System.out.println(number_two);
        try{
        	int number_three=50/0;
        	System.out.println(number_three);
        }catch(ArithmeticException e)
        {
        	System.out.println(e);
        }
        

		
		int number_four=50/25; //10
		System.out.println(number_four);
	}

}
