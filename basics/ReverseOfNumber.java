package com.pack1;

public class ReverseOfNumber {
	public static int Reverse_Number(int n)
	{
		int rev=0;
		int rem;
		while(n>0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println("Reverse Number is " +Reverse_Number(1234));

	}

}
