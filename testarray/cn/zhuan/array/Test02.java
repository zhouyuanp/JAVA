package cn.zhuan.array;

import java.time.chrono.MinguoDate;

/**
 * 数组的基本语法 //声明和初始化
 * 
 * @author 周元鹏
 *
 */

public class Test02 {
	public static void main(String[] args) {
		// 声明 都表示a和b是一个数组
		int[] a;
		int b[];

		// 创建数组对象 --默认初始化,数组元素相当于对象的成员变量
		a = new int[4];
		a[0] = 23;
		a[1] = 28;
		a[2] = 32;
		a[3] = 35;
		b = new int[5];

		// 初始化(对数组元素的初始化)
		// 默认初始化:
		// 数组元素相当于对象的成员变量,默认值跟成员变量的规则一样,
		// 数字是0,布尔false,char\u0000,引用类型:null
		// 动态初始化:
		a[0] = 23;
		a[1] = 45;
		for (int i = 0; i < a.length; i++) {
			a[i] = i * 12;
		}

		// 静态初始化
		int c[] = { 23, 43, 56, 78, 25 }; // 长度:5 索引范围:[0,4]
		Car[] cars = { new Car("奔驰"), new Car("比亚迪"), new Car("宝马"), new Car("大众") };// 与 cars [0] = new Car("大众") 一样
		Car[] cars1 = { 
				new Car("奔驰"), 
				new Car("比亚迪"), 
				new Car("宝马"), 
				new Car("大众")
				 }; // 和cars一样

		Car c2 = new Car("奔驰");
		System.out.println(c2 == cars[0]);
		int[] s = null;
		s = new int[10];
		for (int i = 0; i < 10; i++) {
			s[i] = 2 * i + 1;
			System.out.print(s[i] + "--");
		}
		
		
		
		
		
		

	}  
	public static void main1(String args[]) {   //看不懂啥意思
		MyDate1[] m =null;
		m = new MyDate1[10];
		for (int i = 0; i <10; i++) {
			m[i] = new MyDate1(i+1,i+1,1990+i);
			m[i].display();
			
		}
		
	}

}
