package com.pack1;

import java.util.Scanner;

public class Count_Even {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int count=0;
		for(int i=1;i<=N;i++)
		{
			if(i%2==0)
			{
				count++;
			}
			
		}
		System.out.println(count);
       sc.close();
	}

}
