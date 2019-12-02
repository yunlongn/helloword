package 工厂模式;

public class 红烧猪蹄 implements 烹饪 {

	public void 处理食材() {
		System.out.println("先除去猪蹄上的杂毛");
		System.out.println("然后切成块");
	}
	public void 烹饪() {
		System.out.println("先油炸");
		System.out.println("然后小火焖煮");
	}
	public void 盛盘出锅() {
		System.out.println("盛盘出锅");
	}
}
