package zhuanZhuan;

/*
 * while和for循环的联系题目
 */
public class TestWhileFor {
	public static void main(String[] args) {
		// 计算1-100的和
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum = sum + i;
			// System.out.println(sum);
		}
		System.out.println(sum);
		// 计算1-100奇数的和
		int oddsum = 0; // 用来保存奇数的和
		int evensum = 0; // 用来保存偶数的和
		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0) {
				oddsum += i;
			} else {
				evensum += i;
			}
		}
		System.out.println("奇数的和：" + oddsum);
		System.out.println("偶数的和：" + evensum);
		System.out.println("--------------------------------");
		//循环输出1-1000之间的能被5整除的数 ,并每行输出3个
		for (int j = 1; j <= 1000; j++) {
			if (j % 5 == 0) {
				System.out.print(j+"\t");
			}
			if(j % (5*3) ==0) {
				System.out.println();
			}
		}
		

	}

}
