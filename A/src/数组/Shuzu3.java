package 数组;

public class Shuzu3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] q=new int[][]{{5456,4564,755,5648},{78975,64123,487,465}};
		int length=0;
		for(int[] h:q){
			length=length+h.length;
		}
		int[] y=new int[length];
		
		int inedx=0;
		for(int[] j:q){
			for(int j1:j){
				y[inedx++]=j1;
				
			}
		}for(int i=0;i<y.length;i++){
			for(int g=y.length-1;g>i;g--){
				if(y[g]<y[g-1]){
					int t=y[g];
					y[g]=y[g-1];
					y[g-1]=t;
				}
			}
		}
		inedx=0;
		for(int[] d:q){
			for(int g=0;g<d.length;g++){
			d[g]=y[inedx++];
			}
		}
		for(int[] j:q){
			for(int d1:j){
				System.out.print(d1+"    ");
			}System.out.println();
		}
	}
}
