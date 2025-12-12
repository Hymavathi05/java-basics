package com.pack1;

public class Student1 
{
	int id;
	String name;
	int age;
	Student1(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public void display()
	{
		System.out.println("id: "+id+ " name: "+name+ " age: "+age );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s=new Student1(1,"hyma",21);
		s.display();

	}

}
