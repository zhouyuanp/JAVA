package cn.zhuan.array;

public class Test01 {

	public static void main(String[] args) {
		/*
		 * 1.数组是相同的数据类型(数据类型可以是任意类型)的有序集合 2.数组也是对象,数组元素相当于对象的成员变量(详情见内存图)
		 * 3.数组长度是确定的,不可改变的,入过有越界,则报:ArrayIndexOutofBoundsException
		 */
		int[] a = new int[3]; // 声明和初始化 长度是3,只能放三个数
		a[0] = 23;
		a[1] = 28;
		a[2] = 32;

		Car[] cars = new Car[4];
		cars[0] = new Car("奔驰");
		System.out.println(cars[0].name);

		System.out.println(a.length); // 数组的长度 length 是一个属性不是方法

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
