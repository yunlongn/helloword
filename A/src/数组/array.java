package ����;
//��ʦ�̵�һλ��������
public class array {
void aa(int[] y){
	for(int i=0;i<y.length;i++){					//��ͷ�����������
		for(int j=i;j<y.length;j++){
			if(y[j]<y[i]){
				int t=y[j];
				y[j]=y[i];
				y[i]=t;
			}
		}
	}
}
}
