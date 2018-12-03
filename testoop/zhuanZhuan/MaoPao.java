package zhuanZhuan;

public class MaoPao {
	public static void main(String[] args) {
		int[] a = { 3, 112, 33, 43, 54, 42, 34 };
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "-");
		}
		System.out.println();
		for (int j = 0; j < a.length - 1; j++) {
			for (int i = 0; i < a.length - 1 - j; i++) {
				if (a[i] > a[i + 1]) {
					int c = a[i];
					a[i] = a[i + 1];
					a[i + 1] = c;
				}
			}
		}
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + "-");
		}
		System.out.println();
	}
  }
