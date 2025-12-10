package com.pack1;
import java.util.HashMap;
public class HashMapDemo 
{
   public void HashMap_Demo()
   {
	   HashMap<Integer,String> map=new HashMap<>();
	   map.put(1, "Sravani");
	   map.put(2, "Hymavathi");
	   map.put(3, "Pavani");
	   map.put(4, "Teja");
	   map.put(5, "Ravi");
	   map.remove(5);
	   System.out.println("Keys: "+map.keySet());
	   System.out.println("Values: "+map.values());
	   System.out.println("Entries: "+map.entrySet());
   }
   public static void main(String[] args) 
   {
	   HashMapDemo demo=new HashMapDemo();
	   demo.HashMap_Demo();
}
}
