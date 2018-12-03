package zhuanZhuan;

public class test2 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "wahaha";
		s1.age = 18;
		Computer c = new Computer();
		c.brand = "����";
		c.cpuSpeed = 100;

		s1.computer = c;  //��c��ֵ��s1��computer����,ͨ��computer���õ�ַ�ҵ�brand�ĳ�ʼֵ
		c.brand = "����";
		System.out.println(s1.computer.brand);

	}

}
