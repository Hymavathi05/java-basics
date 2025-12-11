package com.pack1;

public class FindSecondLargest 
{
      public void Find_Second_Largest()
      {
    	  int[] arr= {10,5,20,8,15};
    	  int largest=arr[0];
    	  for(int i=1;i<arr.length;i++)
    		  if(arr[i]>largest)
    			  largest=arr[i];
    	  int second=Integer.MIN_VALUE;
    	  for(int i=0;i<arr.length;i++)
    		  if(arr[i]!=largest&&arr[i]>second)
    			  second=arr[i];
    	  System.out.println("Second Larget = " +second);
      }
      public static void main(String[] args)
      {
		FindSecondLargest fsl=new FindSecondLargest();
		fsl.Find_Second_Largest();
	}
}

