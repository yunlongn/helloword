package com.task02;

import java.util.Scanner;

public class Jsuanshuzixingcheng2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner x=new Scanner(System.in);
		int num=x.nextInt();
		int j=0;
		int i=1;
		while(i<=num)	{
			j+=i;
			i++;
			System.out.print(i-1+"+");
			if(j==num){
				System.out.print("\b"+"="+j);
				break;
			}
			}
		}
	}	



