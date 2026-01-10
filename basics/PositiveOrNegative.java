package com.pack1;
import java.util.Scanner;
public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter a Number:");
          int number=sc.nextInt();
          if(number==0)
          {
        	  System.out.println(number+" is either Positive or Negative Number");
          }
          else if(number > 0)
          {
        	  System.out.println(number+" is Positive Number");
          }
          else
          {
        	  System.out.println(number+" is Negative Number");
          }
          sc.close();
          
	}

}
