package com.pack1;

public class MaxElement 
{
     public void Max_Element()
     {
    	 int[] arr= {10,5,20,8,15};
    	 int max=arr[0];
    	 for(int num:arr)
    		 if(num>max)
    			 max=num;
    	 System.out.println("Maximum Element: "+max);
     }
     public static void main(String[] args) 
     {
		MaxElement me=new MaxElement();
		me.Max_Element();
	}
}
