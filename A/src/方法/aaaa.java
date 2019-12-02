package 方法;

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
		t.name="小名";
		
		aaaa t1=new aaaa();
		t1.name="小2";
		
		aaaa t2=new aaaa();
		t2.name="小1";
		
		t.method();
		t1.method();
		t2.method();
		
	    t1.type="呵呵";
		t.method1();
		t1.method1();
		t2.method1();
	}
}
