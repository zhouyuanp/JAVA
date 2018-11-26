package cn.zhuanzhuan.oop;

/**
 * @author dell-pc
 *
 */
public class Point { // 点类
	// 用来表示三维空间的点有三个坐标
	double x, y, z; // 浮点类型

	public Point(double _x, double _y, double _z) {
		x = _x;
		y = _y;
		z = _z;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}
	// 可以更改原来输入的三个坐标

	public void setX(double _x) {
		x = _x;
		System.out.println(x);
	}

	public void setY(double _y) {
		y = _y;

	}

	public void setZ(double _z) {
		z = _z;

	}

	// 方法一个功能块,输入和输出
	// 输出两点之间的距离 需要开方 Math 的类
	public double distance(Point p) {
		// return
		// Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y)+(x-p.x)*(x-p.x));//开方x*x+y*y+z*z
		// 或者
		double result = Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y) + (z - p.z) * (z - p.z));
		return result;
	}

	public static void main(String[] args) {
		Point p = new Point(3, 4, 8); // 调Point的方法
		Point p2 = new Point(200, 30, 80);
		p.setX(10); // 把10赋给x

		System.out.println(p.x);
		System.out.println(p.distance(p2));

	}

}
