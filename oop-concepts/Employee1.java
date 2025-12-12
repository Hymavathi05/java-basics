package com.pack1;

public class Employee1 {
	int id;
	String name;
	int salary;
	Employee1(int id,String name,int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public void display()
	{
		System.out.println("id: "+id+ " name: "+name+ " salary: "+salary );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 s=new Employee1(1,"hyma",50000);
		s.display();

	}

}
