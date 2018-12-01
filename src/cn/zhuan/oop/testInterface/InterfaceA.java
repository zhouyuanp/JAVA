package cn.zhuan.oop.testInterface;

public interface InterfaceA {
	void aa();

}

interface InterfaceB {
	void bb();

}

interface InterfaceC extends InterfaceA, InterfaceB { // 接口可以多继承
	// 相当于拥有的InterfaceA,InterfaceB的所有方法
	void cc();

}

class TestClass implements InterfaceC {

	@Override
	public void aa() {
		// TODO Auto-generated method stub

	}

	@Override
	public void bb() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cc() {
		// TODO Auto-generated method stub

	}

}
