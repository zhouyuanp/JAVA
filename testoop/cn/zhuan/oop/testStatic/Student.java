package cn.zhuan.oop.testStatic;

public class Student {

	// 静态数据 在静态的方法里面不能调用非静态的属性和方法
	String name;  //属于对象
	int id; // 学号  //属于对象
	static int ss;   //类变量或静态变量  //从属与类的不能直接调用从属对象的

	public static void printSS() {
		System.out.println(ss);
	}

	// 动态方法  普通的方法可以调用静态的属性和方法 
	public void study() {
		printSS();
		System.out.println(name + "在学习");
	}

	public void sayhello(String sname) {
		System.out.println(name + "向" + sname + "说 :你好 !");
	}

}
