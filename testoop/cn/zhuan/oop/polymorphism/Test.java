package cn.zhuan.oop.polymorphism;

public class Test {
	/*
	 * public static void testAnimalVoice(Cat c) { // 没有多态的时候这样写 c.voice(); }
	 * 
	 * public static void testAnimalVoice(Dog c) { c.voice(); }
	 * 
	 * public static void testAnimalVoice(Pig c) { c.voice(); }
	 */
	public static void testAnimalVoice(Animal c) { // 多态
		c.voice();
		if (c instanceof Cat) {             //强制转型   instanceof 运算符
			((Cat) c).catchMouse();
		}

	}

	public static void main(String[] args) {
		Animal a = new Cat(); // 父类的引用指向了子类的对象
		Cat a2 = (Cat) a;
		a2.catchMouse();   //内存分析
		
		
/*		Animal b = new Dog();
		Animal c = new Pig();

		testAnimalVoice(a);
		testAnimalVoice(b);
		testAnimalVoice(c);*/
		// 强制转型
		

	}
}
