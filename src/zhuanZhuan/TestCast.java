package zhuanZhuan;

public class TestCast {
/*	public static void main(String[] args) {
		/*
		 * //测试自动转型和强制转型 cast //能不能转型在哪个范围内 byte b = 123; // byte b2 = 120;//300 // char
		 * c = -3 ; //-3不在char的范围内 后面的数要在前面的类型的表述范围。 char c2 = 'a'; int i = c2; long d01
		 * = 123213; //8字节 float f = d01; //4字节 只考虑表述范围不考虑字节。
		 * 
		 * //强制转型 int 转为 char int i2 =
		 * 100;//比如-100当一种类型强制转为另一种类型，而又超出表述范围，就会被截断成为一个完全不同的值。 char c3 = (char)i2;
		 * //-100超过char的表述范围，会转成无意义的值 System.out.println(c3);
		
		// 表达式中的类型提升问题
		int a = 3;
		long b = 4;
		// int c = a+b ; //所有的二元运算符（+-/*%）都会有类型提升的问题 a+b是long类型把long类型的值给int 会出错。
		int c = (int) (a + b);
		double d = 53.6;
		float f = (float)(a+d);
		System.out.println(f);
		//溢出
		int m = 1000000000;//  10亿
		int y = 20;
		int t = m*y;  //算出的数是负数   溢出：算出的数大于int的表述范围
		long t1 = (long)m*y;  //先转型 再算 lm*y;l不识别
		long times = 70*60*24*365*70l;  //加个l转换类型
		System.out.println(times);

	}
*/
	public  static void main(String[] args) {
/*		byte b = 123;
		byte b2 = 120;
		char c = 100;
		char c2 = 'a';
		System.out.println(c2);
		int i = c2;
		long d = 123123;
		float f = d;
		System.out.println(i);  //参考ASCII码 i=a=97
		
		int i2 =100;
		char c3 = (char)i2;//100超过char的表述范围，所以转换成完全不同的值，无意义的值。
		System.out.println(c3);*/

//表达式中类型提升问题
	int a = 3;
	long b = 4;
	double e = 5.3;
//	int c = a+b;//所有的二元运算符（+-/*%）都会有类型提升的问题 a+b是long类型把long类型的值给int 会出错。
	long c = a+b;   int d = (int)(a+b); //两种解决办法
	float f = (float)(a+e); //强制转型 算完之后是double
	double h = a+e;
	int m = 1000000000;
	int y = 20 ;
	long t = (long)m*y;
	
	System.out.println(t);
//一個人70年心跳多少次
	long times = 70L*365*24*60*70;//尽量把L/l放在前面
	System.out.println(times);
	//jdk新增的特性之一
	//二进制整数  int是4个字节每个字节是8位
	int a1 = 0b00000000000000000000000000000011;
	System.out.println(a1);
	
	//下划线分隔符
	int a2 = 0b0000_0000_0000_0000_0000_0000_0000_0011;
	int a3 = 1_2312_3131;
	System.out.println(a3);
	
	
	
	
	
	
	
	
	
	
	
		
		
}
}