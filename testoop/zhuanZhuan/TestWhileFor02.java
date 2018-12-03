package zhuanZhuan;

public class TestWhileFor02 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				sum = i * j;
				System.out.print(j + "*" + i + "=" + sum + "\t");
				if (i == j) {
					System.out.println();
				}

			}
		}
		// 更优化方案
		for (int a = 0; a <= 9; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print(b + "*" + a + "=" + (a * b) + "\t");

			}
			System.out.println();
		}

	}

}
