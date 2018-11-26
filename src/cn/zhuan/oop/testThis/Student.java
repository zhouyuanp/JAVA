package cn.zhuan.oop.testThis;

public class Student {

	// 静态数据 在静态的方法里面不能调用非静态的属性和方法
	String name; // 属于对象
	int id; // 学号 //属于对象
	/* 第二种用法 */

	public Student(String name, int id) { // 构造方法 this.常用于get和set方法以及构造方法
		this();// 通过this()方法调用另外一个构造方法且必须位于第一句
		this.name = name;
		this.id = id;
	}

	/* 第三种用法 */
	public void setName(String name) {
		this.name = name;

	}

	public Student() {
		System.out.println("构造一个对象");
	}

	// 动态方法 普通的方法可以调用静态的属性和方法
	/* 第一种用法 */
	public void study(String name) { // 默认传this 可以理解为形参
		this.name = name;
		System.out.println(name + "在学习");
	}

	public void sayhello(String sname) {
		System.out.println(name + "向" + sname + "说 :你好 !");
	}

}
