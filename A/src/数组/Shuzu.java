package 数组;
//二维数组变成一维数组

public class Shuzu {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] h=new int[][]{{5456,4564,755,5648},{78975,64123,487,465}};
		int length=0;		//先把两个数组一共有多少个数算出来
		for(int[] j:h){
			length=length+j.length;
		}
		int[] y=new int[length];//创立一个一维数组
		
		int index=0;				  //将之前h的二维数组的数字放进创立的新一维数组y里面去
		for(int[] k:h){
			for(int k1:k){
				y[index++]=k1;				
			}
		}
		for(int i=0;i<y.length;i++){					//将一维数组里面的数字排序
			for(int j=y.length-1;j>i;j--){
				if(y[j]<y[j-1]){
					int t=y[j];
					y[j]=y[j-1];
					y[j-1]=t;
				}
			}
		}
		index=0;											//将排列好的一维数组以h要求的形式放入h数组中
		for(int[] p:h){									//    用p将h这个二维数组一个数组一个数组的拿出来。。
			for(int g=0;g<p.length;g++){	//		然后将每个p一维数组的每一项弄出来
				p[g]=y[index++];					//			
			}													//		
		}														//
		for(int[] p:h){										//将二维数组打印出来！
			for(int k:p){
				System.out.print(k+"\t");
			}System.out.println();
		}
	}
}

