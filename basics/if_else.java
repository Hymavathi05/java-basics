package com.pack1;
import java.util.Scanner;
public class if_else {
public static void main(String[] args) 
{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int x=sc.nextInt();
		if(x==0)
		{
			System.out.println(x + " is Zero");
			
		}
		else if(x>0)
		{
			System.out.println(x + " is Positive");
		}
		else
		{
			System.out.println(x + " is Negative");
		}
		sc.close();
		
}

}
