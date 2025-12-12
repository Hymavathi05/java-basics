package com.pack1;

public class Child1 extends Parent1{
	String msg="msg from child class";
	Child1()
	{
		super();
		System.out.println("Child1 class constructor");
	}
	void display1()
	{
		super.dispaly();
		System.out.println("Child1 class diplay1 method called");
		System.out.println(super.msg);
	}

}
