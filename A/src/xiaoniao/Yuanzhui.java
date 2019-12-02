package xiaoniao;

import java.util.Scanner;

public class Yuanzhui{
	@SuppressWarnings("resource")
	public static void main(String args[]){
	final double PI=3.141516f;
	double tiji,biaomianji;
	System.out.println("输入半径：");
	Scanner x=new Scanner(System.in);
	double radius=x.nextDouble();//半径 
	System.out.println("输入高度：");
	Scanner c=new Scanner(System.in);
	double gao=c.nextDouble();
	double muxian=(double)Math.sqrt(radius*radius+gao*gao);//求母线长度
	tiji=(radius*radius*PI*gao) / 3;
	double tijie=(float)tiji;
	biaomianji=muxian*PI*radius+2*PI*radius;
	System.out.println("圆锥半径："+radius);
	System.out.println("圆锥高度："+gao);
	System.out.println("圆锥体积："+tijie);
	System.out.println("圆锥表面积："+biaomianji);
	}
}