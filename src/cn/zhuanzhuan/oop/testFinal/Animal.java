package cn.zhuanzhuan.oop.testFinal;

public /* final*/ class Animal { // 动物   子类 /*final修饰类则说明,这个类不能被继承*/
	String eye;

	public /*final*/ void run() {     //final 加到方法前面意味着该方法不能被子类重写      修饰方法
		System.out.println("会跑!");

	}
}


class Bird extends Animal {   

	public void run() {
		super.run();
		System.out.println("小鸟可以飞的更高");  //重写父类  子类的run把父类的run覆盖了
	}
	
}












