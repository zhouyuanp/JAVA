package cn.zhuan.oop.polymorphism;

public class Animal {
	String str;

	public void voice() { // 叫声
		System.out.println("普通动物叫声");

	}
}
class Cat extends Animal{  //重写voice并继承
	public void voice() {
		System.out.println("喵喵喵");
	}
	public void catchMouse(){ //猫的其他方法 比如抓老鼠
		System.out.println("抓老鼠");
		
	}
}
class Dog extends Animal{  //重写voice并继承
	public void voice() {
		System.out.println("汪汪汪");
	}
	public void seeDoor(){ //狗的其他方法 比如看门
		System.out.println("看门中");
		
	}
	
}
class Pig extends Animal{  //重写voice并继承
	public void voice() {
		System.out.println("哼哼哼");
	}
}
























