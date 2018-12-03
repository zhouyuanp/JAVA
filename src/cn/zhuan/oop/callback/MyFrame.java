package cn.zhuan.oop.callback;

public abstract class MyFrame {
	public abstract void paint(); // 抽象类实现 //希望所有的子类都重写这个方法

}

interface IMyFrame { // 接口的实现

	void paint(); // 通过接口实现

}
