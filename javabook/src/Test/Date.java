package Test;
//输入年和月出现日期
import java.util.Scanner;

public class Date {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner x=new Scanner(System.in);
		System.out.println("输入年份：");
		int yeas=x.nextInt();
		System.out.println("输入月份：");
		int month=x.nextInt();
		int totaldays=0;
		int monthdays=0;
		int totalmonthdays=0;
		for(int i=1900;i<yeas;i++){
		if((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)){
			totaldays+=366;
		}else{
			totaldays+=365;
		}
		}
		for(int j=1;j<=month;j++){
			if(j==1||j==3||j==5||j==7||j==8||j==10||j==12){
				 monthdays=31;
			}
			if(j==4||j==6||j==9||j==11){
				 monthdays=30;
			}
			if(j==2){
				if((yeas % 4 == 0 && yeas % 100 != 0) || (yeas % 400 == 0)){
					monthdays=29;		
				}else{
					monthdays=28;	
				}
			}
			if(j>12){
				System.out.println("你输入的月份有误！！！！");
				 System.exit(0);
			}
			if(j<month){
					totalmonthdays+=monthdays; }
		}
		 totaldays=totaldays+totalmonthdays;
		 int temp=1+totaldays%7;
		 if(temp==7){
			 temp=0;
		 }
		 
		 System.out.println("----------------"+month+"月----------------");
		 System.out.println("日\t一\t二\t三\t四\t五\t六");
		 for(int k=0;k<temp;k++){
			 System.out.print("\t");
		 }
		 for(int m = 1; m <= monthdays; m++){
			 System.out.print( m + "\t");
			 if((totaldays+ m) % 7 == 6){
			 System.out.print("\n");
			 }
		 }
	}
}