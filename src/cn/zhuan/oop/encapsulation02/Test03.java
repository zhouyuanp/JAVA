package cn.zhuan.oop.encapsulation02;

import cn.zhuan.oop.encapsulation01.Test01;

public class Test03 {
	public static void main(String[] args) {
		Test01 t = new Test01();
		t.print1();//测试public 跨包调用
	}
}
