package ����;
//��ά������һά����

public class Shuzu {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[][] h=new int[][]{{5456,4564,755,5648},{78975,64123,487,465}};
		int length=0;		//�Ȱ���������һ���ж��ٸ��������
		for(int[] j:h){
			length=length+j.length;
		}
		int[] y=new int[length];//����һ��һά����
		
		int index=0;				  //��֮ǰh�Ķ�ά��������ַŽ���������һά����y����ȥ
		for(int[] k:h){
			for(int k1:k){
				y[index++]=k1;				
			}
		}
		for(int i=0;i<y.length;i++){					//��һά�����������������
			for(int j=y.length-1;j>i;j--){
				if(y[j]<y[j-1]){
					int t=y[j];
					y[j]=y[j-1];
					y[j-1]=t;
				}
			}
		}
		index=0;											//�����кõ�һά������hҪ�����ʽ����h������
		for(int[] p:h){									//    ��p��h�����ά����һ������һ��������ó�������
			for(int g=0;g<p.length;g++){	//		Ȼ��ÿ��pһά�����ÿһ��Ū����
				p[g]=y[index++];					//			
			}													//		
		}														//
		for(int[] p:h){										//����ά�����ӡ������
			for(int k:p){
				System.out.print(k+"\t");
			}System.out.println();
		}
	}
}

