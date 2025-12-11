package com.pack1;

public class FindPairWithGivenSum 
{
      public void Find_Sum()
      {
    	  int arr[]= {2,7,11,15,20,25};
    	  int target=22;
    	  int left=0;
    	  int right=arr.length-1;
    	  while(left<right)
    	  {
    		  int sum=arr[left]+arr[right];
    		  if(sum==target)
    		  {
    			  System.out.println("Pair Found :"+arr[left] +" " +arr[right]);
    			  return;
    	      }
    		  else if(sum < target)
    		  {
    			  left++;
    		  }
    		  else
    		  {
    			  right--;
    		  }
    	  }
    	  System.out.println("Not Found");
}
      public static void main(String[] args) 
      {
		FindPairWithGivenSum fpw=new FindPairWithGivenSum();
		fpw.Find_Sum();
      }
	}
