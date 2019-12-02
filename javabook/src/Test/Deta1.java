package Test;
//显示12个月的日历
import java.util.Scanner;

public class Deta1 {
static void rili(int monthdays,int total,int m){
	System.out.println("日\t一\t二\t三\t四\t五\t六");
	for(int i=1;i<=m;i++){
		System.out.print("\t");
	}
	for(int j=1;j<=monthdays;j++){
		System.out.print(j+"\t");
		if((total+j)%7==6){
			System.out.println();
		}
	}
}
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int yeas=x.nextInt();
		int totaldays=0;
		int monthdays=0;
		int totalmonthdays=0;
			for(int i=1900;i<yeas;i++){
				if(i%4==0&&i%100!=0||i%400==0){
					totaldays+=366;
				}else{
					totaldays+=365;
				}
			}
		for(int month=1;month<=12;month++){
			monthdays=0;
			totalmonthdays=0;
			for(int j=1;j<=month;j++){
				if(j==1||j==3||j==5||j==7||j==8||j==10||j==12){
					monthdays=31;
				}
				if(j==4||j==6||j==9||j==11){
					monthdays=30;
				}
				if(j==2){
					if(yeas%4==0&&yeas%100!=0||yeas%400==0){
						monthdays=29;
					}else{
						monthdays=28;
					}
					}
				if(j<month){
					totalmonthdays+=monthdays;
				}
			}
			int total=totaldays+totalmonthdays;
			int m=1+total%7;
			if(m==7){
			m=0;
			}
			System.out.println("----------------"+month+"月----------------");
			rili(monthdays, total, m);
			System.out.println();
			}
	}
}