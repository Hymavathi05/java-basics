package com.pack1;
import java.util.HashSet;
public class HashSetDemo 
{
     public void HashSet_demo()
     {
    	 HashSet<String> set=new HashSet<>();
    	 set.add("Sravani");
    	 set.add("Sravani");
    	 set.add("Hyma");
    	 set.add("Pavani");
    	 System.out.println(set);
    	 System.out.println("Size: "+set.size());
     }
     public static void main(String[] args) 
     {
	      HashSetDemo demo=new HashSetDemo();
	      demo.HashSet_demo();
	}

}
