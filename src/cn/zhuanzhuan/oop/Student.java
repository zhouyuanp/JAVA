package cn.zhuanzhuan.oop;

public class Student {
	// 静态的数据 属性
	String name;
	int id;
	int age;
	String gender; // 性别
	int weight; // 重量
	Computer computer; //表示一台电脑多时可以用数组
	// 动态的行为 方法

	public void study() {
		System.out.println(name + "在学习");
	}

	public void sayhello(String sname) {
		System.out.println(name + "向" + sname + "说 : 你好 !");
	}

}
