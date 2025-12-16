package com.pack1;
import java.util.Scanner;
public class Div_By_Num {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number:");
	int num=sc.nextInt();
	if(num ==0)
	{
		System.out.println("0 is divisible by every number.");
	}
	else if(num%5==0 &&num%11==0)
	{
		System.out.println(num + " is divisible by 5 and 11");
	}
	else
	{
		System.out.println(num + " is not divisible by 5 and 11");
	}
	sc.close();
}
}
