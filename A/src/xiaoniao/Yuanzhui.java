package xiaoniao;

import java.util.Scanner;

public class Yuanzhui{
	@SuppressWarnings("resource")
	public static void main(String args[]){
	final double PI=3.141516f;
	double tiji,biaomianji;
	System.out.println("����뾶��");
	Scanner x=new Scanner(System.in);
	double radius=x.nextDouble();//�뾶 
	System.out.println("����߶ȣ�");
	Scanner c=new Scanner(System.in);
	double gao=c.nextDouble();
	double muxian=(double)Math.sqrt(radius*radius+gao*gao);//��ĸ�߳���
	tiji=(radius*radius*PI*gao) / 3;
	double tijie=(float)tiji;
	biaomianji=muxian*PI*radius+2*PI*radius;
	System.out.println("Բ׶�뾶��"+radius);
	System.out.println("Բ׶�߶ȣ�"+gao);
	System.out.println("Բ׶�����"+tijie);
	System.out.println("Բ׶�������"+biaomianji);
	}
}