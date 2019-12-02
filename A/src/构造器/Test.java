package 构造器;

public class Test {
		Test(){
			this("小宇");
			System.out.println("1.Test.......................");
		}
		Test(String name){
			this.name=name;
			System.out.println("2.Test...................");
		}
		String name;
		void setname(String name){
			this.name=name;
		}
	public static void main(String[] args) {
			Test q=new Test();
			q.setname("小莫");

	}

}
