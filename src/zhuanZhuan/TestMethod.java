package zhuanZhuan;

/*
 * 测试方法
 */
public class TestMethod {
	// 定义一个方法
	public static void test01(int a) { // void 表示没有返回值
		// 计算1-100奇数的和
		int oddsum = 0; // 用来保存奇数的和
		int evensum = 0; // 用来保存偶数的和
		for (int i = 0; i <= a; i++) {
			if (i % 2 != 0) {
				oddsum += i;
			} else {
				evensum += i;
			}
		}
		System.out.println("奇数的和：" + oddsum);
		System.out.println("偶数的和：" + evensum);
	}

	public static void test02(int a, int b, int c) {
		// 循环输出1-1000之间的能被5整除的数 ,并每行输出3个
		for (int j = 1; j <= a; j++) {
			if (j % b == 0) {
				System.out.print(j + "\t");
			}
			if (j % (b * c) == 0) {
				System.out.println();
			}
		}
	}

	// 定义方法
	public static int add(int a, int b) { // 形式参数
		int sum = a + b;
		if (a == 3) {
			return 0; // return 两个作用:结束方法的运行和 返回值
		}
		System.out.println("输出");
		return sum;
	}

	public static void main(String[] args) {
		test01(1000); // 在同一个类中调用 方法的作用供别人调用
		System.out.println("--------------------------------");
		test02(100, 6, 3); // 1-100之间,可以被6整除,没行输出3个.
		System.out.println("============");
		int s = add(3, 5); // 调用方法 和实际参数
		System.out.println(s);
	}
}
