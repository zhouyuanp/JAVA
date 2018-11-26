package cn.zhuan.oop.inherit;
/*
 * 测试组合
 */

public class Animal2 { // 动物 子类
	String eye;

	public void run() {
		System.out.println("跑跑!");
	}

	public void eat() {
		System.out.println("吃吃会吃好吃的!");
	}

	public void Sleep() {
		System.out.println("zzzzzz睡觉  ");
	}

	public Animal2() {// 构造放法中有两个隐式参数 this 指当前的对象 和 super 直接父类对象
		super();
		System.out.println("创建一个动物");
	}

	public static void main(String[] args) {////////////////////////////////
		Bird2 b = new Bird2();
		b.run();

	}
}

class Mammal2 { // 扩展Animal的方法 父类 
	Animal2 animal2 = new Animal2();//把Animal2 作为一个属性放这

	public void viviparity() { // 胎生
		System.out.println("胎生的 !");

	}

}

class Bird2 { // 鸟类 父类

	Animal2 animal2 = new Animal2();

	public void run() {
		animal2.run();
		System.out.println("我是一只小小鸟,怎么飞也飞不高.小鸟可以飞的更高"); // 重写父类 子类的run把父类的run覆盖了
	}

	public void eggs() {
		System.out.println("蛋生的  !");
	}
	public Bird2() {
		
		System.out.println("建一个鸟的对象");
	}
}
