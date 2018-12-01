package cn.zhuan.oop.testInterface;

public class Test {
	public static void main(String[] args) {
		Flyable f = new Stone();// 父类引用指向子类对象 不能new Flyable
		f.fly(); // f 只能引用Flyable的中属性和方法 或者强制转型 和多态一样
	}
}
