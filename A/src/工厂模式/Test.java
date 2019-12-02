package 工厂模式;

public class Test {
	public static void main(String[] args) {
		烹饪 p=烹饪工厂.caret("红烧猪蹄");
		
		if(p instanceof 表演操刀){
		表演操刀 x=(表演操刀) p;
		x.表演();
		}
		
		p.处理食材();
		
		p.烹饪();
		
		p.盛盘出锅();
		
		
		
	}
}
