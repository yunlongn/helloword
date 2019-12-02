package 数组;

public class Shuzu1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] t=new int[][]{{12,12,12,1,2,12,12},{4,56,456,456,456,45}};
		for(int i=0;i<t.length;i++){
			for(int g=1;g<t[i].length;g++){
				System.out.print(t[i][g]+"  ");
			}System.out.println();
		}
		
	}

}
