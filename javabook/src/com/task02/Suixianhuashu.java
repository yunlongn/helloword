package com.task02;

public class Suixianhuashu {

	public static void main(String[] args)
	{
		int baiwei=0;
		int shiwei=0;
		int gewei=0;
		System.out.println("Ë®ÏÉ»¨Êý£º");
		for(int i=100;i<=999;i++){
			baiwei=i/100;
			shiwei=i/10-baiwei*10;
			gewei=i-baiwei*100-shiwei*10;
			int shuixianhua=gewei*gewei*gewei+shiwei*shiwei*shiwei+baiwei*baiwei*baiwei;
				if(shuixianhua==i)
		{
			System.out.print(" "+i);
		}
		
	}
	
	}
}
