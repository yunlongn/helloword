package com.task02;

public class 教师 {
private	String Name;
private	String ZhuanYe;
private	String KeCheng;
private	int  NianLing;

void show(){
	System.out.println("姓名："+Name+"\n专业方向："+ZhuanYe+"\n教授的课程："+KeCheng+"\n年龄："+NianLing);
}
	public static void main(String[] args) {
		教师 a=new 教师();
		a.setName("常贤发");
		a.setZhuanYe("java");
		a.setKeCheng("java基础");
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
