package com.task02;

import java.util.Scanner;

public class Jsuanshuzixingcheng {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner x=new Scanner(System.in);
		int num=x.nextInt();
		int j=0;
		for(int i=1;i<=num;i++)
		{
				j+=i;
			 if(j==num)
			{for(int m=1;m<=i;m++)
			{
				System.out.print(m+"+");
			}
			System.out.print("\b"+"="+j);
			break;
		}

			}

			}
		}
			
	


