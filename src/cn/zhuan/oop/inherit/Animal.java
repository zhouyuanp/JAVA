package cn.zhuan.oop.inherit;
/*
 * 测试继承
 */

public class Animal { // 动物   子类
	String eye;

	public void run() {   
		System.out.println("会跑!");

	}

	public void eat() {
		System.out.println("会吃好吃的!");

	}
	public void Sleep() {
		System.out.println("睡觉  ");
	}
	public Animal() {//构造放法中有两个隐式参数 this 指当前的对象 和 super 直接父类对象
		super();
		System.out.println("创建一个动物");
	}
}

class Mammal extends Animal {   //扩展Animal的方法   父类
/*	public void run() {    
		System.out.println("会跑!");

	}

	public void eat() {
		System.out.println("会吃好吃的!");

	}     //A继承了B，A是A的，B的也是A的
*/
	public void viviparity() { // 胎生
		this.run();
		System.out.println("胎生的 !");

	}
}


class Reptile {   //爬行动物
	public void run() {
		System.out.println("会跑!");

	}

	public void eat() {
		System.out.println("会吃好吃的!");

	}

	public void eggs() {
		System.out.println("蛋生的  !");
	}

}
class Bird extends Animal {   //鸟类  父类
/*	public void run() {
		System.out.println("会飞的   !");   //如果继承Animal的run()这个方法需要重写

	}

	public void eat() {
		System.out.println("会吃好吃的!");

	}
*/
	public Bird() {
		super();
		System.out.println("建一个鸟的对象");
	}
	
	
	public void run() {
		super.run();
		System.out.println("小鸟可以飞的更高");  //重写父类  子类的run把父类的run覆盖了
	}
	public void eggs() {
		System.out.println("蛋生的  !");
	}
	
	
	
}












