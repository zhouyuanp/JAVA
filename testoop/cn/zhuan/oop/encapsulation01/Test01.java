package cn.zhuan.oop.encapsulation01;

public class Test01 {
	private String str; // 同类可见

	private void print() { // 测试default 同类和同包中调用
		String s = str; // 同类调用用
		System.out.println("test01.print()");
	}

	public void print1() { // 测试public 同类和同包中调用 子类和所有类
		String s = str; // 同类调用用
		System.out.println("test01.print()");
	}

	class Test001 extends Test01 {
		public void pp() {
			super.print();
		}
	}
	protected void Test00() {
		System.out.println("测试protected受保护的");
	}
    void Test002() {
		System.out.println("测试默认default的");
	}
	public  void main(String[] args) {
		print1();
		print(); //测试private 测试私有的同类调用
		Test00(); //测试受保护的protected同类调用
		Test002();//测试默认default的同类调用
		
		
	}

}
