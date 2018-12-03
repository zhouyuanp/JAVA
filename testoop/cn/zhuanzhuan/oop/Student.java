package cn.zhuanzhuan.oop;

public class Student {
	// 静态数据
	String name;
	int id; // 学号
	int age;
	String gender;
	int weight;
	Computer computer;

	// 动态方法
	public void study() {
		System.out.println(name + "在学习");
	}

	public void sayhello(String sname) {
		System.out.println(name + "向" + sname + "说 :你好 !");
	}

}
