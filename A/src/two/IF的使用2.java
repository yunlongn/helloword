package two;

import java.util.Scanner;

public class IF��ʹ��2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println("����a��");
		Scanner x=new Scanner(System.in);
		double a=x.nextDouble();
		System.out.println("����˷���");
		Scanner c=new Scanner(System.in);
		double z=c.nextDouble();
		System.out.println("����b��");
		Scanner d=new Scanner(System.in);
		double b=d.nextDouble();
		//int a=100,b=4
		String oper="z";
		switch(oper)
		{
		case"+" :
			System.out.println(a+"+"+b+"="+((double)a+b));
			break;
		case"-":
			System.out.println(a+"-"+b+"="+((double)a-b));
			break;
		case"*":
			System.out.println(a+"*"+b+"="+((double)a*b));
			break;
		case"/":
			System.out.println(a+"/"+b+"="+((double)a/b));
			break;
			default:
				System.out.println("δ֪������");
		}
	}

}
