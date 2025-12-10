package com.pack1;
import java.util.Scanner;
public class ReverseString 
{
	 public void Reverse_String()
	 {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter String:");
     String input=sc.nextLine();
     String reversed="";
     for(int i=input.length()-1;i>=0;i--)
     {
    	 reversed+=input.charAt(i);
     }
     System.out.println("Reversed String: "+reversed);
     sc.close();
	 } 
	 public static void main(String[] args) 
	 {
		ReverseString obj=new ReverseString();
		obj.Reverse_String();
	 }
}
