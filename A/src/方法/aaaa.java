package ����;

public class aaaa {
	static String type;
	String name;
	void method(){
		System.out.println("name="+name);
	}
	static void method1(){
		System.out.println("type="+type);
	}
	public static void main(String[] args) {
		aaaa t=new aaaa();
		t.name="С��";
		
		aaaa t1=new aaaa();
		t1.name="С2";
		
		aaaa t2=new aaaa();
		t2.name="С1";
		
		t.method();
		t1.method();
		t2.method();
		
	    t1.type="�Ǻ�";
		t.method1();
		t1.method1();
		t2.method1();
	}
}
