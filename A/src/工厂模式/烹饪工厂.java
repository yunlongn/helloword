package 工厂模式;

public class 烹饪工厂 {
	public static 烹饪 caret (String name) {									//烹饪后面的   caret    并不是关键词
		if(name.equals("红烧猪蹄")){                                                 	
			
			return new 红烧猪蹄2();														//将return出来的对象换成我继承修改了内容的红烧猪蹄
		}else if(name.equals("西红柿炒鸡蛋")){	
			
			return   new 西红柿炒鸡蛋();	
		}else if(name.equals("松鼠桂鱼")){
			
			return new 松鼠桂鱼1();
		}																								//如果要添加样式就得在这里用return出来
		return null;	
	}
}
