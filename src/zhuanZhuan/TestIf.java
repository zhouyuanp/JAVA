package zhuanZhuan;

/*
 * 测试if语句
 */
public class TestIf {
	public static void main(String[] args) {
		// 返回一个随机0到1之间的小数
		double d = Math.random();
		int e = 1 + (int) (d * 6); // 返回的是[0,4]之间的整数,强制转型会取小数点的第一位
		System.out.println(e);
		if (e > 3) {
			System.out.println("e的值大于3输出大数,e随机数 ");
		} else { // 否则逻辑
			System.out.println("小于等于3等于一个小数");
		}
		System.out.println("测试多选择结构");
		if (e == 6) {
			System.out.println("e等于6 运气挺好");
		} else if (e >= 4) {
			System.out.println("e大于等于4 运气不错");
		} else if (e >= 2) {
			System.out.println("e大于等于2 运气一般吧");
		} else {
			System.out.println("e 小于2运气不太好,慢慢来,慢慢变好");
		}

	}
}
