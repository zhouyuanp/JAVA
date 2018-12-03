package zhuanZhuan;
/*
 * 测试递归
 */

public class TestRecurrsion {
	static int a = 1; // 全局变量

	public static void test01() {
		a++;
		System.out.println("test01:" + a);
		if (a <= 10) { // 递归头 什么时候调自己
			test01();
		} else { // 递归体 什么是不调用自己
			System.out.println("over");
		}

	}

	public static void test02() {
		System.out.println("TestRecurrsion.test02()");

	}
 //计算阶乘
	public static long test03(int n) {
		if (n == 1) {
			return 1 ;
		} else {
			return n*test03(n-1);  //计算加法n+test03(n-1);
		}
	}

	public static void main(String[] args) {
		test01();
		System.out.println(test03(20));
	}
}
