package com.task02;

import java.util.Scanner;

public class As {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner x=new Scanner(System.in);
		int num=x.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=num-1;j>=i;j--)
			{
				System.out.print("   ");			
			}
			for(int m=i;m>=1;m--)
			{
				System.out.print(m);
				System.out.print(" ");
			}
			for(int n=2;n<=i;n++)
			{
				System.out.print(n);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
