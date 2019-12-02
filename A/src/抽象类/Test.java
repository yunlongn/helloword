package 抽象类;

public abstract class Test implements 售票员{   //首先你得都继承父类属性

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		售票员 	function=new 小张();                                      	//然后你调用小张用父类对象。现在只需要更改new后面的对象即可调用
		function.售票();
		function.找零();
		function.咨询();
	}

}
