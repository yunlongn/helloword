package Test;

import java.util.Scanner;

public class Wnl {
	public static void main(String[] args) {	
		Scanner x=new Scanner(System.in);
		int year=x.nextInt();
		int month=x.nextInt();
		int yeardays=0;
		int monthdays=0;
		int monthtotal=0;
		for(int i = 1900 ; i < year ; i++){
			if(i % 100 ==0 && i % 400==0 || i % 100 !=0 && i % 4==0){
				yeardays+=366;
			}else{
				yeardays+=365;
			}
		}
		for(int j = 1 ; j <= month ; j++){
			switch(j){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				monthdays=31;
				break;
			case 2:
				if(year % 100==0 && year % 400==0 || year %100 != 0 && year % 4 ==0){
					monthdays=29;
				}else{
					monthdays=28;
				}break;
			default:
				monthdays=30;	
				break;
			}
			if(j<month){
				monthtotal+=monthdays;
			}
		}
		int total=monthtotal+yeardays;
		int m=1+total%7;
		if(m==7){
			m=0;
		}
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		for(int i = 0 ; i < m ;i++){
			System.out.print("\t");
		}
		for(int a = 1; a <= monthdays;a++){
			System.out.print(a+"\t");
			if(((total+a)%7)==6){
				System.out.println();
			}
		}
	}
}