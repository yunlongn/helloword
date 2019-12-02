package 方法;
//方法调用
public class Fang {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	
		//System.out.println(add(6));
		//int y=get(11);
		//System.out.println(y);
				/**int[] p={56456,64,654,65,15,16,56,15,1,65,5645};
					aa(p);//（这个是让数组排序，，只能用于一维数组）**/
		int[][] q={{5456465,45,64,56,456,45,64,5,4,56},{2,31,21,3,1531,351,53,1,53156,161}};
		dd(q);
		for(int[] k:q){
			for(int k1:k){
				System.out.print(k1+" ");
			}System.out.println();
		}
	}
	static void dd(int[][] a){
		int length=0;
		for(int[] p:a){
			length=length+p.length;
		}
		int[] y=new int[length];
		int inedx=0;
		for(int[] q:a){
			for(int j1:q){
				y[inedx++]=j1;
				
			}
		}
		for(int i=0;i<y.length;i++){
			for(int j=y.length-1;j>i;j--){
				if(y[j]<y[j-1]){
					int t=y[j];
					y[j]=y[j-1];
					y[j-1]=t;
				}
			}
		}
		int index=0;
		for(int[] k:a){
			for(int i=0;i<k.length;i++){
				k[i]=y[index++];
			}
		}
		for(int[] k:a){
			for(int k1:k){
				System.out.print(k1+" ");
			}System.out.println();
		}
	}
	static void aa(int[] a){
		int sum=0;
		for(int i=0;i<a.length;i++){
			for(int j=a.length-1;j>i;j--){
				if(a[j]<a[j-1]){
					int t=a[j];
					a[j]=a[j-1];
					a[j-1]=t;
				}
			}
		}
		for(int y:a){
			System.out.print(y+" ");
		}
	}
	static int add(int num){
		if(num==1){
			return 1;
		}
		return num+add(num-1);
	}
	static int get(int c){
		if(c==6){
			return 5;
		}else{
			return 88;
		}
	}
}
