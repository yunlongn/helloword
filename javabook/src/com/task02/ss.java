package com.task02;

import java.util.Scanner;

public class ss {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		 int years = 0;
		 int month = 0;
		 int days = 0; 
		 boolean isRun = false;
		 //�Ŀ���̨ݔ���꣬��
		 Scanner input = new Scanner(System.in);
		 System.out.print("Ոݔ����ݣ�");
		 years = input.nextInt();
		 System.out.print("Ոݔ���·ݣ�");
		 month = input.nextInt();
		 System.out.println("\n*********"+years+"��"+month+"�� �Օѱ�************");
		 //�ж��Ƿ�������
		 if((years % 4 == 0 && years % 100 != 0) || (years % 400 == 0)){
		 isRun = true;
		 }
		 int totalDays = 0; //��Ӌ�씵
		 //Ӌ����x1900��1��1�յ��씵
		 for(int i = 1900; i < years; i++){
		 if((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)){
		 totalDays = totalDays + 366;
		 }else{
		 totalDays = totalDays + 365;
		 }
		 }
		 int beforeDays = 0;
		 //�����·��Д��씵
		 for(int j = 1; j <= month; j++){
		 switch(j){
		 case 1:
		 case 3:
		 case 5:
		 case 7:
		 case 8:
		 case 10:
		 case 12:
		 days = 31;
		 break;
		 case 4:
		 case 6:
		 case 9:
		 case 11:
		 days = 30;
		 break;
		 case 2:
		 if(isRun){
		  days = 29;
		 }else{
		  days = 28;
		 }
		 default:
		 System.out.println("�����·ݲ���ȷ!!");
		 }
		 if(j < month){
		 beforeDays = beforeDays + days;
		 }
		 }
		 totalDays = totalDays + beforeDays; //�yӋ��Ŀǰ���씵
		 int firstDayOfMonth = 0;
		 int temp = 1 + totalDays % 7 ;
		 if(temp == 7){
		 firstDayOfMonth = 0; //�L��
		 }else{
		 firstDayOfMonth = temp;
		 }
		 /* ������� */
		 System.out.println("������\t����һ\t���ڶ�\t������\t������\t������\t������");
		 for(int k = 0; k < firstDayOfMonth; k++){
		 System.out.print("\t");
		 }
		 for(int m = 1; m <= days; m++){
		 System.out.print( m + "\t");
		 if((totalDays + m) % 7 == 6){
		 System.out.print("\n");
		 }
		 }
		 }
		}