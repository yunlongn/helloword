package com.task02;

import java.util.Scanner;

public class Zuoye3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("���빤�ʣ�");
		Scanner t=new Scanner(System.in);
		double gongzi=t.nextDouble();
		if(gongzi<=3500)
			System.out.print("���ý�˰");
		else if(3500<gongzi&&gongzi<=5000)
			System.out.print("Ӧ��˰"+((gongzi-3500)*0.03));
		else if(5000<gongzi&&gongzi<=8000)
			System.out.print("Ӧ��˰"+((gongzi-5000)*0.1+1500*0.03));
		else if(8000<gongzi&&gongzi<=12500)
			System.out.print("Ӧ��˰"+((gongzi-8000)*0.2+3000*0.1+1500*0.03));
		else if(12500<gongzi&&gongzi<=1500)
			System.out.print("Ӧ��˰"+((gongzi-12500)*0.25+4500*0.2+3000*0.1+1500*0.03));
		else
			System.out.print("Ӧ��˰"+((gongzi-15000)*0.3+2500*0.25+4500*0.2+3000*0.1+1500*0.03));
			
	}
}

