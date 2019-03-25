package DelaultPackage;
/**
 * 测试算数运算符
 * @author DELL
 *
 */


public class TestOperator01 {
	public static void main(String[] args) {
	/*	byte a = 1;
		int  b = 2;
		long b2 = 3;
		//byte c = a+b;   //结果为int类型 不能把int类型转换成byte类型
		//int c2 = b2+b;   //结果为long类型不能把long类型的值赋值给int   不能把long类型转换成int类型 
		
		float f1 = 3.14F;  //加F  不能把double类型赋值给float
		float d = b+b2;
		
		//float d2 = f1+6.2; //double 不能赋值给float  只要一个数为double则结果为double
		System.out.println(-9%5);
		*/
		//测试自增和自减
		int a = 3;
		int b = a++;  //a自增一次  a++ 先赋值后自增  先把3 赋值给b ,++a 先自增后赋值先变为4后在赋值给b
		System.out.println("a="+a+"\nb="+b);
		a = 3;
		b = ++a; //++a 先自增后赋值先变为4后在赋值给b
        System.out.println("a="+a+"\nb="+b);
		
		
		
		
		
	}
	
	
	

}
