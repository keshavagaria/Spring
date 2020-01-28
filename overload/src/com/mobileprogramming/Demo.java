package com.mobileprogramming;

public class Demo {
	
	static void display()
	{
		System.out.println("Displaying");
	}

	static void display(int x)
	{
		System.out.println("Displaying "+x);
	}
	
	void display(boolean value)
	{
		System.out.println("Displaying "+value);
	}
	
	final void show()
	{
		System.out.println("Showing");
	}
	
	final void show(int a)
	{
		System.out.println("Showing "+a);
	}
}

class Test2{
	public static void main(String[] args) {
		Demo d=new Demo();
		d.display();
		d.display(100);
		d.display(false);
		d.show();
		d.show(100);
	}
}
