package com.task02;

import java.util.Scanner;
/*���磺����6��ʱ��1+2+3=6
 * */
public class Jisuandanshuhe {

	public static void main(String[] args) {
	System.out.println("���������ܺͣ�");
	Scanner x=new Scanner(System.in);
	int num=x.nextInt();
	int j=0;
	int i=1;
	for(i=1;i<=num;i++)
	{
		if(i%2!=0)
		{
			System.out.print(i+"+");
			j+=i;
		}
		}System.out.print("\b"+"="+j);
	}
}


