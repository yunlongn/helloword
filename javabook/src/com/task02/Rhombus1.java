package com.task02;

import java.util.Scanner;

public class Rhombus1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("输入棱形边长");
		Scanner x=new Scanner(System.in);
		int num=x.nextInt();
	    for(int i=1;i<=num;i++)
	    {
	    	for(int j=num-1;j>=i;j--)
	    	{
	    		System.out.print(" ");
	    	}for(int m=1;m<=i*2-1;m++)
	    	{
	    		System.out.print("*");
	    	}
	    		System.out.println();
	    }
	    for(int i=1;i<=num;i++)
	    {
	    	for(int j=1;j<=i;j++)
	    	{
	    		System.out.print(" ");
	    	}for(int m=1;m<=(2*num-1)-2*i;m++)
	    	{
	    		System.out.print("*");
	    	}System.out.println();
	    }
	    }

}
