package 循环;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		System.out.println("输入运算数:");		
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
		long i=1,sum=0;
		
		while (i<=a){
			sum+=i;
			i++;
			
		}System.out.println("输出"+sum);
	}
	
}

