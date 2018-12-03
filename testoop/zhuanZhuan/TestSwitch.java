package zhuanZhuan;
/*
 * 测试Switch语句
 */

public class TestSwitch {
	public static void main(String[] args) {
		double d = Math.random();
		int e = 1 + (int) (d * 6); // 返回的是[0,4]之间的整数,强制转型会取小数点的第一位
		System.out.println(e);
		System.out.println("测试多选择结构");
		if (e == 6) {
			System.out.println("e等于6 运气挺好");
		} else if (e == 5) {
			System.out.println("e等于4 运气不错");
		} else if (e == 4) {
			System.out.println("e等于4运气一般吧");
		} else { // 1,2,3
			System.out.println("e 小于3运气不太好,慢慢来,慢慢变好");
		}
		// 如果遇到等值来判断的,可以使用Switch语句来代替
		System.out.println("=========================================");
		switch (e) { // e可以是变量和表达式,接受返回的结果是int 或者自动转为int的类型(byte,char,short)等枚举
		// jdk7 新特性 可以放置字符串.
		case 6:
			System.out.println("e等于6 运气挺好");
			break; // 一般在每个case后面都要加break,防止出现case穿透现象.
		case 5:
			System.out.println("e等于4 运气不错");
			break;
		case 4:
			System.out.println("e等于4运气一般吧");
			break;
		default:
			System.out.println("e 小于3运气不太好,慢慢来,慢慢变好");
			break;
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		char c = 'a'; //a在十进制中表示97 a表示一个字符
		System.out.println(c);
		int rand =(int)(26*Math.random());//26乘[0,1)中的随机数
		System.out.println(rand);
		char c2 = (char)(c+rand);
		System.out.println(c2 + ":");
		switch (c2) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("元音");
			break;
		case 'y':
		case 'w':
			System.out.println("半元音");
			break;
		default:
			System.out.println("辅音");
		}
		
		
		
		
		
		
		
	}

}
