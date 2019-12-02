package two;

import java.util.Scanner;

public class IF的使用2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("输入a：");
		Scanner x=new Scanner(System.in);
		double a=x.nextDouble();
		System.out.println("输入乘法：");
		Scanner c=new Scanner(System.in);
		double z=c.nextDouble();
		System.out.println("输入b：");
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
				System.out.println("未知操作！");
		}
	}

}
