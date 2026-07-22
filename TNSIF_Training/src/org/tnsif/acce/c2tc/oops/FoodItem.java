package org.tnsif.acce.c2tc.oops;

public class FoodItem {
	String name;
	double price;
	String category;
	
	void displayDetails()
	{
		System.out.println("Food Name : "+name);
		System.out.println("price : "+price);
		System.out.println("category :"+category);
		System.out.println("-------");
	}

	public static void main(String[] args) {
		FoodItem fooditem1=new FoodItem();
		fooditem1.name="Burger";
		fooditem1.price=299.00;
		fooditem1.category="Fast food";
		
	    fooditem1.displayDetails();
		
	    FoodItem fooditem2=new FoodItem();
	    
	    fooditem2.name="Burger";
		fooditem2.price=299.00;
		fooditem2.category="Fast food";
		fooditem2.displayDetails();
		
	    
		// TODO Auto-generated method stub

	}

}
