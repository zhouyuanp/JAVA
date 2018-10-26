package interface001;

public class Method {
	public static void main(String[] args) {
		method();
	}

	public static int method() {
		int[] a = { 12, 18, 9, 8, 19, 25, 16, 13, 14, 10 };
		for (int i = 0; i < a.length - 1; i++) { // 控制外部循环控制这个数组的循环循环次数
			// System.out.print(a[i]); 控制循环的次数外部循环的次数
			for (int j = 0; j < a.length - 1 - i; j++) {// 控制内部循环，总体长度减循环的长度控制后后一个数和
				// a[j]元素的后一位j一开始是0，a[j+1]元素i的后一位18 控制前一个数和后一个数的比较
				if (a[j] > a[j + 1]) {
					int c = a[j];// 元素
					a[j] = a[j + 1];
					a[j + 1] = c;
				}
			}
		}
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + "-");
		}
		int k = 0;
		return a[k];
	}

}
