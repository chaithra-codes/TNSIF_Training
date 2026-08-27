package org.tnsif.acce.c2tc.lambda_expression;
interface Drawablee{  
    public void draw();  
}  
class test implements Drawablee {
	int width =10;
	public void draw()
	{
		System.out.println("Drawing "+width);
	}  
};  

public class withoutLambdaExp {

	public static void main(String[] args) {
		Drawablee d = new test();
        d.draw();  

	}

}
