package cn.zhuanzhuan.oop;

public class test2 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "wahaha";
		s1.age = 18;
		Computer c = new Computer();
		c.brand = "戴尔";
		c.cpuSpeed = 100;

		s1.computer = c;  //把c的值给s1的computer属性,通过computer引用地址找到brand的初始值
		c.brand = "联想";
		System.out.println(s1.computer.brand);

	}

}
