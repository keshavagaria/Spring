package com.mobileprogramming;

public class Demo2 {

	//static blank final variable demo
	
	static final int x;
	
	static {
		x=500;
		System.out.println(x);
	}
	Demo2()
	{
		System.out.println("Default constructor");
	}

}
class Testing{
	public static void main(String[] args) {
		Demo2 demo=new Demo2();
		
	}
}