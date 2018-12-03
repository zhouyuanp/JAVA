package zhuanZhuan;

public class TestBreakContinue {
	public static void main(String[] args) {
		int total = 0;
		System.out.println("开始-Begin");
		while (true) {
			total++;
			int i = (int) Math.round(100 * Math.random());
			if (i == 88) {
				break;// 遇到88就结束本次循环
			}
		}
		System.out.println("Game over," + total + "times.");
		System.out.println("++++++++++++++++++++++");
		for (int i = 100; i < 150; i++) {
			if (i % 3 == 0) {
				continue; // 只能输出不被3整除的数,并且不结束循环
			}
			System.out.println(i);
		}
		// 质数是被0和他本身整除的数质数只能整除他自己本身
		System.out.println("===========================");
		int count = 0;
		outer: for (int i = 101; i < 150; i++) { // outer 表示带标签的continue,跳转到指定循环 goto思想
			for (int j = 2; j < i / 2; j++) {// i在101-149质检 j在2-i/2之间 2-74.5
				if (i % j == 0)  //在这区(101-149)的数被这个区间(2-74.5)的其他数整除的数都不是质数
					continue outer; // 从内部循环调转到外部循环
			}
			System.out.print(i + "   ");
		}

	}

}
