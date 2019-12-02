package com.task02;
import java.util.Calendar;
import java.util.Scanner;
public class RR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Calendar c = Calendar.getInstance();
        System.out.println("请输入数字年：（比如 2014）");
        int year = sc.nextInt();
        sc.close();
//      int year = 2014;
        c.set(Calendar.YEAR,year);
        
        
        for (int i = 0; i < 12; i++) {
        	c.set(Calendar.MONTH,i);  //
        	c.set(Calendar.DATE,1);  //设置成1月
        	printMonth(c);
		} 
        
    }
    
    public static void printMonth(Calendar c){
    	c.set(Calendar.DAY_OF_MONTH,1);   //设置成一日
    	System.out.printf("\n\n=========  %s  月  =========\n",c.get(Calendar.MONTH)+1);
        String[] weeks = { "日", "一" ,  "二",  "三",  "四",  "五",  "六" };
        for (int i = 0; i < weeks.length; i++) {
            System.out.printf("%s" + (i != 6 ?"\t":"\n"),weeks[i]);
        }
         
        int offday = c.get(Calendar.DAY_OF_WEEK) - 1;
        
        for(int i = 0; i < offday; i++){
            System.out.printf("\t");
        }
         
        int month = c.get(Calendar.MONTH);
        while(c.get(Calendar.MONTH) == month ){
            System.out.printf("%d" + ( (c.get(Calendar.DAY_OF_WEEK)) != 7 ? "\t":"\n") ,c.get(Calendar.DAY_OF_MONTH));
            c.add(Calendar.DAY_OF_MONTH, 1);
        }
    }
}