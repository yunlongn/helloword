package 数组;
//老师教的一位数组排序
public class array {
void aa(int[] y){
	for(int i=0;i<y.length;i++){					//开头向后数组排序
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
