package com.task02;

import java.util.Scanner;

public class Application {

	public static void main(String[] args){
		Scanner x=new Scanner(System.in);
		System.out.println("ÊäÈëÊı×Ö£º");
		int temp=x.nextInt();
		int sum=0;
		int temp1=temp;
		for(int i=0;i<temp;i++){
			if(i>=1)
					temp1=temp1*10+temp;
			sum+=temp1;
					System.out.print(temp1+"+");
		}System.out.println("\b"+"="+sum);
	}
}
