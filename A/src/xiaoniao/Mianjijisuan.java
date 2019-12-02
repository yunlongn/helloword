package xiaoniao;

import java.util.Scanner;

public class Mianjijisuan {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		final double PI=3.1415926927;//定义常量
		double perimeter,area;
		System.out.print("请输入扇形半径。");
		Scanner Xc=new Scanner(System.in);
		double radius=Xc.nextDouble();//输入半径
		System.out.print("请输入扇形角度");
		Scanner c=new Scanner(System.in);
		double angle=c.nextDouble();
		area=PI*radius*radius*angle/360;
		perimeter=PI*radius*angle/180+2*radius;
		int perimeterInt=(int)perimeter;
		System.out.println("扇形半径："+radius);
		System.out.println("扇形角度："+angle);
		System.out.println("扇形面积："+area);
		System.out.println("扇形周长（只保留整数部分）："+perimeterInt);
		
		}

	}