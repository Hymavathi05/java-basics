package com.pack1;
import java.util.Scanner;
public class countWords {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Sentence:");
	String sen=sc.nextLine();
	int counter=0;
	
	for(int i=0;i<sen.length();i++)
	{
		if(sen.charAt(i) !=' ' && (i==0 || sen.charAt(i-1)==' '))
		{
			counter++;
		}
	}
	System.out.println(counter+" Number of words in sentence");
	sc.close();
	}

}
