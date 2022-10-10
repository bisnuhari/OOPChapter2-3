package com.chapter3;

//Java Program to Illustrate Working of
//Parameterized Constructor

//Class 1
class Param {
	// data members of the class.
	String name;
	int id;

	// Constructor would initialize data members
	// With the values of passed arguments while
	// Object of that class created
	Param(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
}

//Class 2
public class ParamConstructor {
	// main driver method
	public static void main(String[] args)
	{
		// This would invoke the parameterized constructor.
		Param param1 = new Param ("adam", 1);
		System.out.println("ParamName :" + param1.name
						+ " and ParamId :" + param1.id);
	}
}
