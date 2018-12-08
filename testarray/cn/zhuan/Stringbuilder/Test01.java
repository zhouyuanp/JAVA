package cn.zhuan.Stringbuilder;
/**
 *String:不可变字符序列 
  *  测试可变字符序列 .StringBuilder(线程不安全,效率高),StringBuffer(线程安全,效率低)
 * @author Administrator
 *
 */

public abstract class Test01 {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();  //字符数组长度初始为16
		System.out.println(sb);
		StringBuilder sb1 = new StringBuilder(32);  //字符数组长度初始为32
		StringBuilder sb2 = new StringBuilder("abcd");  //字符数组长度初始为32,value[] = {'a','b','c','d',\u0000,\u0000.....}  默认初始化
		sb2.append("efg");//累加到 sb2的数组后面  //可变字符序列
		sb2.append(true);//相当于字符串相连
		sb2.append(321).append("哇哈哈哈");//通过return this 实现方法链
		System.out.println(sb2);
		
		System.out.println("--------------");
		StringBuilder gh = new StringBuilder("a");   //数组扩容,建立一个新数组把旧数组替换了
		for (int i = 0; i < 10; i++) {
			gh.append(i);
		}
		System.out.println(gh);
		
		
		
		
		
	}
	

}
