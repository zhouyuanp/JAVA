package cn.zhuan.oop.encapsulation02;

import cn.zhuan.oop.encapsulation01.Test01;

public class Test0001 extends Test01 {
	public void main(String[] args) {
		Test0001 t = new Test0001();
		t.print1();  //测试public 在子类和跨包调用
		t.Test00();//测试受保护的protected子类调用
	}

}
