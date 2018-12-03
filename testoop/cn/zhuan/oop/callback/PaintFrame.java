package cn.zhuan.oop.callback;

public class PaintFrame { // 画窗口
	public static void drawFrame(IMyFrame f) {
		System.out.println("启动线程");
		System.out.println("增加循环");
		System.out.println("查看消息栈");

		// 画窗口
		f.paint();

		System.out.println("启动缓存,增加效率");

	}

	public static void main(String[] args) {
		drawFrame(new GameFrame02()); // 传不同参数调用的结果不同
	}

}

class GameFrame01 implements IMyFrame /* extends MyFrame */ { // 继承 MyFrame 定义了一个不同的子类
	public void paint() { // 重写方法
		System.out.println("GameFrame01.paint()");
		System.out.println("画窗口");

	}
}

class GameFrame02 implements IMyFrame/* extends MyFrame */ { // 继承 MyFrame 定义了一个不同的子类
	public void paint() { // 重写方法
		System.out.println("GameFrame02.paint()");
		System.out.println("画窗口");

	}
}
