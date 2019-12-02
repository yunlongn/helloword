package com.task02;

import java.util.Scanner;

public class Zuoye1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int zhengshu;
		System.out.print("输入加密前数字");
		Scanner x=new Scanner(System.in);
		double c=x.nextDouble();
		zhengshu=(int)((c*10+5)/2+3.1457);
		System.out.print("加密结果="+zhengshu);
		
	}

}
