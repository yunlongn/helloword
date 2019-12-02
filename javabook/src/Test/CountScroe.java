package Test;

import java.util.ArrayList;
import java.util.Arrays;

public class CountScroe {

	CountScroe() {

		int[] rater = { 9, 2, 3, 4, 5, 6, 7, 8, 1, 10 };
		int[] rater_new = { 9, 2, 3, 4, 5, 6, 7, 8, 1, 10 };
		rater_new = rater;
		Arrays.sort(rater_new);
		int sum = 0;
		for (int i = 1; i < rater_new.length - 1; i++) {
			sum += rater_new[i];
		}

		double average = (double) sum / 8; // 平均值
		double[] average_shuzu = new double[rater.length];
		for (int i = 0; i < rater.length; i++) {
			average_shuzu[i] = rater[i] - average;
		}

		for (double b : average_shuzu) {
			System.out.println(b);
		}
		double[] average_shuzu_new1 = new double[rater_new.length];
		average_shuzu_new1 = average_shuzu;
		Arrays.sort(average_shuzu_new1);

		// int s=Arrays.binarySearch(average_shuzu_new,average_shuzu_new1[0]);
		// //找到最接近平均分的索引位置
		// System.out.println(average_shuzu_new[1]);
	}

	public static void main(String[] args) {
		CountScroe x = new CountScroe();
	}
}
