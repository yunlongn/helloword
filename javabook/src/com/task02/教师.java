package com.task02;

public class ��ʦ {
private	String Name;
private	String ZhuanYe;
private	String KeCheng;
private	int  NianLing;

void show(){
	System.out.println("������"+Name+"\nרҵ����"+ZhuanYe+"\n���ڵĿγ̣�"+KeCheng+"\n���䣺"+NianLing);
}
	public static void main(String[] args) {
		��ʦ a=new ��ʦ();
		a.setName("���ͷ�");
		a.setZhuanYe("java");
		a.setKeCheng("java����");
		a.setNianLing(18);
		a.show();
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getZhuanYe() {
		return ZhuanYe;
	}
	public void setZhuanYe(String zhuanYe) {
		ZhuanYe = zhuanYe;
	}
	public String getKeCheng() {
		return KeCheng;
	}
	public void setKeCheng(String keCheng) {
		KeCheng = keCheng;
	}
	public int getNianLing() {
		return NianLing;
	}
	public void setNianLing(int nianLing) {
		NianLing = nianLing;
	}
}
