package org.tnsif.acce.c2tc.lambda_expression;

interface Sayable{
	
	
		 public String say();  
	}  
	

	 
	
	public class LambdaNopara {  
	public static void main(String[] args) {  
	    Sayable s=()-> {  
	        return "I have nothing to say.";  
	    };  
	    System.out.println(s.say());  
	}  
	}  
	