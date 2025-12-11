package com.pack1;

public class ReverseArrayTwoPointers 
{
     public void reverse_array()
     {
    	 int arr[]= {10,20,30,40,50};
    	 int left=0;
    	 int right=arr.length-1;
    	 while(left <right)
    	 {
    		 int temp=arr[left];
    		 arr[left]=arr[right];
    		 arr[right]=temp;
    		 left++;
    		 right--;
    	 }
    	 for(int num:arr)
    	 {
    		 System.out.println(num + " ");
    	 }
     }
     public static void main(String[] args)
     {
	  ReverseArrayTwoPointers ra=new  ReverseArrayTwoPointers ();
	  ra.reverse_array();
	}
}
