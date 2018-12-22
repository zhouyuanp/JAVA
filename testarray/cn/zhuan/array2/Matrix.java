package cn.zhuan.array2;

/**
 * 封装了矩阵的常用算法
 * 
 * @author Administrator
 *
 */

public class Matrix {
	/**
	 * 打印指定的矩阵
	 * 
	 * @param c
	 */

	public static void print(int[][] c) { // 定义一个打矩阵的方法
		// 打印矩阵
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
	}

	/**
	 * 打印矩阵加法
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static int[][] add(int[][] a, int[][] b) {
		int[][] c = new int[a.length][b.length];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}

		return c;

	}

	public static void main(String[] args) {
		int[][] a = { // 静态初始化
				{ 1, 3, 4 }, { 2, 4, 5 }, { 2, 4, 5 }, };
		int[][] b = { // 静态初始化
				{ 3, 4, 4 }, { 5, 6, 7 }, { 5, 6, 6 }, };
//		int[][] c = new int[2][2];
//		for (int i = 0; i < c.length; i++) {
//			for (int j = 0; j < c.length; j++) {
//				c[i][j] = a[i][j] + b[i][j];
//			}
//		}
//		System.out.println(c[0][0] + "\t" + c[0][1]);
//		System.out.println(c[1][0] + "\t" + c[1][1]);
//		// 打印矩阵
//		for (int i = 0; i < c.length; i++) {
//			for (int j = 0; j < c.length; j++) {
//				System.out.println(c[i][j] + "\t");
//			}
//			System.out.println();
//		}
		// 调用add 打印三阶矩阵

		int[][] c = add(a, b);
		print(c);

	}

}
