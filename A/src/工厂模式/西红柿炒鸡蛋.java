package 工厂模式;

public class 西红柿炒鸡蛋 implements 烹饪{
	public void 处理食材() {
		System.out.println("先把鸡蛋打入碗中");
		System.out.println("西红柿切成块");
	}
	public void 烹饪() {
		System.out.println("先把鸡蛋煮熟");
		System.out.println("放西红柿炒");
	}
	public void 盛盘出锅() {
		System.out.println("盛盘出锅");
	}
}
