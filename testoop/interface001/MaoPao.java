package interface001;

import java.util.Arrays;

public class MaoPao {
	public static void main(String[] args) {

		int[] a = { 12, 18, 9, 8, 19, 25, 16, 13, 14, 10 };
		add(a);
	}

	public static void add(int[] a) {

		for (int i = 0; i < a.length - 1; i++) { // 控制外部循环控制这个数组的循环循环次数
			// System.out.print(a[i]); 控制循环的次数外部循环的次数
			for (int j = 0; j < a.length - 1 - i; j++) {// 控制内部循环，总体长度减循环的长度控制后后一个数和
				// a[j]元素的后一位j一开始是0，a[j+1]元素i的后一位18 控制前一个数和后一个数的比较
				if (a[j] > a[j + 1]) {
					int c = a[j];// 元素
					a[j] = a[j + 1];
					a[j + 1] = c;
				}
				// System.out.println(Arrays.toString(a)+"趟数");
			}
			// System.out.println(Arrays.toString(a)+"次数");
		}
		System.out.println(Arrays.toString(a));
	}

} // System.out.println();
