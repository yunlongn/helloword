package xiaoniao;

import java.util.Scanner;

public class Mianjijisuan {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		final double PI=3.1415926927;//���峣��
		double perimeter,area;
		System.out.print("���������ΰ뾶��");
		Scanner Xc=new Scanner(System.in);
		double radius=Xc.nextDouble();//����뾶
		System.out.print("���������νǶ�");
		Scanner c=new Scanner(System.in);
		double angle=c.nextDouble();
		area=PI*radius*radius*angle/360;
		perimeter=PI*radius*angle/180+2*radius;
		int perimeterInt=(int)perimeter;
		System.out.println("���ΰ뾶��"+radius);
		System.out.println("���νǶȣ�"+angle);
		System.out.println("���������"+area);
		System.out.println("�����ܳ���ֻ�����������֣���"+perimeterInt);
		
		}

	}