package ����ģʽ;

public class ��⿹��� {
	public static ��� caret (String name) {									//��⿺����   caret    �����ǹؼ���
		if(name.equals("��������")){                                                 	
			
			return new ��������2();														//��return�����Ķ��󻻳��Ҽ̳��޸������ݵĺ�������
		}else if(name.equals("������������")){	
			
			return   new ������������();	
		}else if(name.equals("�������")){
			
			return new �������1();
		}																								//���Ҫ�����ʽ�͵���������return����
		return null;	
	}
}
