package com.mp;

public class Dog {
	 void bark()
	{
		System.out.println("Barking");
	}
	
	void bark(int x)
	{
		System.out.println("Barking "+x+" times");
	}
}

class Babydog extends Dog{
	
	void bark()
	{
		System.out.println("BabyDog Barking");
	}
	void meow()
	{
		System.out.println("Meowing");
	}
}

class Run{
	public static void main(String[] args) {
		Dog d=new Babydog();
		d.bark();
		d.bark(20);
		//d.meow();
	}
}