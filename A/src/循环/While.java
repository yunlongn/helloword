package ѭ��;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		System.out.println("����������:");		
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
		long i=1,sum=0;
		
		while (i<=a){
			sum+=i;
			i++;
			
		}System.out.println("���"+sum);
	}
	
}

