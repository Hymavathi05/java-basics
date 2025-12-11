package com.pack1;

public class PalindromeTwoPointer 
{
     public void Check_Palindrome()
     {
    	 String s="madam";
    	 int left=0;
    	 int right=s.length()-1;
    	 while(left < right)
    	 {
    		 if(s.charAt(left)!=s.charAt(right))
    		 {
    		 System.out.println("Not a Palindrome");
    	     return;
    		 }
    		 left++;
    		 right--;
     }
    	 System.out.println("Palindrome");
}
     public static void main(String[] args)
     {
		PalindromeTwoPointer ptp=new PalindromeTwoPointer();
		ptp.Check_Palindrome();
	}
}
