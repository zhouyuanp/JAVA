package cn.zhuan.oop.testInterface;

public interface Flyable {
	int MAX_SPEED = 11000;
	int MIN_HEIGHT = 1;

	public void fly();
}

interface Attack { // 攻击接口
	void attack();

}

class Plane implements Flyable {

	@Override
	public void fly() {
		System.out.println("飞机依靠发动机飞翔....");

	}

}

class Man implements Flyable {

	@Override
	public void fly() {
		System.out.println("跳起来飞.....");

	}

}

class Stone implements Flyable, Attack { // 石头
	int weight;

	@Override
	public void fly() {
		System.out.println("被人扔出去飞......");

	}

	@Override
	public void attack() {
		System.out.println("石头攻击......");
	}

}
