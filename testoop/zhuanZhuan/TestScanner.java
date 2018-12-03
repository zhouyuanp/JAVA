package zhuanZhuan;

import java.util.Scanner;

/**
 * 测试Scanner 类的使用,在控制台接受键盘的输入
 * @author 周元鹏
 * 
 *
 */

public class TestScanner {
	public static void test01() {
		Scanner s = new Scanner(System.in);
		String str = s.next();//程序运行到next时会阻塞,等待键盘输入
	
		System.out.println("键盘输入的是:"+str);
		
	}
	public static void test02() {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入一个加数:");
		int a = s.nextInt();
		System.out.println("请输入被加数:");
	    int b = s.nextInt();
	    int sum = a+b;
	    System.out.println("计算的和为:"+sum);
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		test02();
	}

}
