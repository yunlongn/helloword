package xiaoniao;

import java.util.Scanner;

public class Circle
{
	@SuppressWarnings("resource")
	void calculate()
	{
		System.out.print("请输入圆的半径。");
		Scanner x=new Scanner(System.in);
		double r=x.nextDouble();
		double area=3.14*r*r;
		double circumferencr=2*r*3.14;

		System.out.print("半径为"+r+"的圆,"+"其周长为："+circumferencr+"，面积为:"+area);
		
	}

	public static void main(String args[])
	{
		Circle c1=new Circle();
		c1.calculate();
	}
}