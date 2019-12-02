package 工厂模式;

public class 松鼠桂鱼 implements 烹饪 {
	public void 处理食材() {
		System.out.println("先切成丁字不要断");
		System.out.println("用调味料腌制");
	}
	public void 烹饪() {
		System.out.println("先油炸");
		System.out.println("然后小火焖煮");
	}
	public void 盛盘出锅() {
		System.out.println("盛盘出锅");
	}
}
