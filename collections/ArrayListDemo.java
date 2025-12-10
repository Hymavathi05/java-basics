package com.pack1;
import java.util.ArrayList;
public class ArrayListDemo 
{
	 public void ArrayList_Demo()
	 {
     ArrayList<String> list=new ArrayList<>();
     list.add("Sravani");
     list.add("Hymavathi");
     list.add("PavaniSri");
     list.add("Teja");
     list.add("Kiran");
     list.add("Ravi");
     list.remove(5);
     list.set(1, "Hyma");
     for(String name:list)
     {
    	 System.out.println(name);
     }
	 }
	 public static void main(String[] args) 
	 {
		ArrayListDemo demo=new ArrayListDemo();
		demo.ArrayList_Demo();
	 }
}
