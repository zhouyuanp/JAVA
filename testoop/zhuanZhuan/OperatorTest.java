package zhuanZhuan;

public class OperatorTest {

	public static void main(String[] args) {
	/*	// 小数也可以取余数
		double d = 10.2%3;
		System.out.println(d);
		//自增自减
		int a = 3;
		int b = a++;    
		System.out.println(b);//执行完b=3；a=4；先给b赋值，在自增
		int c = ++a;
		System.out.println(c);//执行完c=5，a=4；先自增，再给b赋值
		System.out.println(a);
		*/
	/*	//逻辑运算符
		//int c =3/0;
		boolean a = 1>2&&2>(3/0);
		System.out.println(a);
		boolean b = 3>2||2>(3/0);
		System.out.println(b);
		*/
		//位运算符
		int a = 8; //1000
		int b = 4; //0100
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(~a);
		System.out.println(a^b);
		boolean b1 = true&false;
		boolean b2 = true|false;
		boolean b3 = true^false;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println("-------");
		//移位算法只能   除2乘2
		int m = 3*2*2;
		int n = 3<<2; //相当于 3*2*2
		int c = 12/2/2;
		int d = 12>>2;
		System.out.println(m);
		System.out.println(n);
		System.out.println(c);
		System.out.println(d);
		//扩展运算符
		int a1 = 3;
		a1 +=5; //a=a+5;
		System.out.println(a1);
		//字符串连接符
		String str = "3";
		int s = 4;
	    System.out.println(s+str);
		System.out.println(s+"3");
		//三元运算符
		int q = 3;
		int p = 5;
		String str1 = "";
		if(a>b){
			str1 = "q<p";
		}else{
			str1 = "q>p";
		}
		System.out.println(str1);
		str1 = (q<p)?"q<p":"q>=p";
		System.out.println(str1);
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
