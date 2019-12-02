package com.task02;

import java.util.Scanner;

public class Rhombus {

	public static void main(String[] args) {
	System.out.println("输入棱形边长：");
	Scanner x=new Scanner(System.in);
	int num=x.nextInt();
		for(int a=1;a<=num;a++)
		{
			for(int b=num-1;b>=a;b--)
			{
				System.out.print(" ");
			}
				System.out.print("*");//每行第一个*号
				for(int m=1;m<=2*a-3;m++)
				{
					System.out.print(" ");
				}	
				if(a>1){
				      System.out.print("*");//每行最后一个*号
				}else{
						System.out.print(" ");
				}
				System.out.println();
		}
		for(int a=1;a<=num-1;a++)
			{
			for(int b=1;b<=a;b++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
				for(int m=1;m<=(2*num-1)-2*a-2;m++)
				{
					System.out.print(" ");
				}
				if(a==num-1){
				      System.out.print(" ");//每行最后一个*号
				}else{
						System.out.print("*");
				}
				System.out.println();
			}
	}

}
