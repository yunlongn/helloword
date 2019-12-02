package 循环;

public class Zuoye {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		double num=8;
		for (int i=1;i<=100;i++)
		{
			num*=1.25;
			if(num>=20)
			{
				System.out.println(i);
				break;
			}
		}
	}

}
