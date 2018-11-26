package cn.zhuan.oop.abstractClass;

public abstract class Animal {
	String str;

	public abstract void run(); // 抽象方法的意义:将方法的设计和方法的实现分离

	public void breath() { // 通过new Cat();的方式来进行调用和实现
		System.out.println("呼吸.....");
		run();
	}
}

class Cat extends Animal {

	@Override // 重写 父类的方法
	public void run() {
		System.out.println("猫步快跑");

	}

}

class Dog extends Animal {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
