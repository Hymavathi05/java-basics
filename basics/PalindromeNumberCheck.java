package com.pack1;
public class PalindromeNumberCheck {
   public static boolean Palindrome_Number_Check(int num)
   {
	   if(num < 0)
	   {
		   return false;
	   }
	   if(num !=0 && num%10==0)
	   {
		   return false;
	   }
	 int original=num;
	 int reverse=0;
	 while(num > 0)
	 {
		 reverse=reverse*10+num%10;
		 num /=10;
	 }
	 return original==reverse;
   }
	
	public static void main(String[] args) {
		System.out.println(Palindrome_Number_Check(101));//121,1001-p,123,10-np
	}
}
