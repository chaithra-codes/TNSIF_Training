package org.tnsif.acce.c2tc.exceptionhandling;

public class NullPointerException {

	public static void main(String[] args) {
		String words=null;
		try {
			System.out.println(words.length());
			
		}catch(Exception e) {
			System.out.println(e);
		}
		finally
		{
			System.out.println("No matter this block will get executed");
		}
		

	}

}
