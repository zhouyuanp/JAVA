package cn.zhuan.oop.Outer;

import cn.zhuan.oop.Outer.Face.Nose;

public class Outer { // 内部类
	public static void main(String[] args) {
		Face f = new Face();
		Nose n = f.new Nose(); // 通过face访问nose
		n.breath();
		Face.Ear e = new Face.Ear();
		e.listen();
		Face.Eye E = new Face.Eye();
		E.look();
	}

}

class Face {

	int type;
	String shape = "瓜子脸";
	static String color = "红润";

	class Nose { // 内部类 鼻子00
		String type;

		void breath() { // 在内部类定义方法 //普通成员内部类只能定义普通的类和方法
			System.out.println("呼吸");
			System.out.println(Face.this.type + "外部");
			System.out.println(this.type + "内部");
			System.out.println(shape + "命名外部不与内部类冲突");
		}

	}

	static class Ear {
		void listen() {
			System.out.println(color); // 可引用静态的属性
			System.out.println("我在听...");
		}

	}

	static class Eye {

		static void look() {
			System.out.println();
		}
	}

}
