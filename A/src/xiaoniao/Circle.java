package xiaoniao;

import java.util.Scanner;

public class Circle
{
	@SuppressWarnings("resource")
	void calculate()
	{
		System.out.print("������Բ�İ뾶��");
		Scanner x=new Scanner(System.in);
		double r=x.nextDouble();
		double area=3.14*r*r;
		double circumferencr=2*r*3.14;

		System.out.print("�뾶Ϊ"+r+"��Բ,"+"���ܳ�Ϊ��"+circumferencr+"�����Ϊ:"+area);
		
	}

	public static void main(String args[])
	{
		Circle c1=new Circle();
		c1.calculate();
	}
}