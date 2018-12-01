package cn.zhuan.oop.testInterface;

public interface MyInterface {
	// 接口中只有:常量和抽象方法

	/* public static final 接口中常量定义时:写或者不写都有 */String MAX_GREAD = "BOSS";
	int MAX_SPEED = 120;

	public void test01(); // 声明基本不变 //不能私有 private//都是public abstract 来修饰

	public int test02(int a, int b);

}
