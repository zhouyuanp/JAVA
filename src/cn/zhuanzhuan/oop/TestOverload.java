package cn.zhuanzhuan.oop;

/**
 * 测试重载 重载的重点是不构成歧义,就可以重载
 * 
 * @author dell-pc 自己起的类名尽量不要和jdk中的类名重复
 */
public class TestOverload {
	public static void main(String[] args) {
		MyMath m = new MyMath();
		int result = m.add(4.2, 5);
		System.out.println(result);

	}
}

class MyMath {// 同一个名字定义了两个方法名 重载
	// 重载 相同:同一个类和同一个方法名
	// 不同: 类型不同 ,个数不同, 顺序不同
	int a; // int a = this.a
	int b;

	public MyMath() { // 构造方法

	}

	public MyMath(int a) {
		this.a = a; // a ==int a

	}

	public MyMath(int a, int b) { // 避免构造方法重载
		this.a = a;
		this.b = b;
	}

	public int add(int b, double a) { // 顺序不同
		return (int) (a + b);
	}

	public int add(double a, int b) { // 类型不同
		return (int) (a + b);
	}

	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) { // 个数不同
		return a + b + c;
	}
}
