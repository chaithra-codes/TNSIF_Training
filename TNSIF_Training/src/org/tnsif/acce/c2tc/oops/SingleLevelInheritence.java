package org.tnsif.acce.c2tc.oops;

class Course
{
	String courseName="Java Programmming"; 
	
	void showCourse()
	{
		System.out.println("Course :"+courseName);
	}
}
//sub class
class Student extends Course 
{
	String name="Ali";
	
	void showStudent()
	{
		System.out.println("Student : "+name);
	}
}




public class SingleLevelInheritence {

	public static void main(String[] args) {
		Student student=new Student();
		student.showCourse();
		student.showStudent();
		

	}


		
	}


