package cn.zhuan.oop.encapsulation01;

public class Test02 {

	public static void main(String[] args) {
		Test01 t = new Test01();
       	//t.print();  不显示Test01中的方法
		t.print1();//同包中调用
		t.Test00();//测试受保护的同个包protected调用
		t.Test002();//测试默认default的同包调用
	
	}
}
