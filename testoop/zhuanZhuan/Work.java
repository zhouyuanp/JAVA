package zhuanZhuan;

public class Work {

	public static void main(String[] args) {
		int a = 10 ;
		byte b =20;
		short c = 256;
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		//定义8进制的数    0开头的都是8进制的  0 1 2 3 4 5 6 7    10
		int a2 =010;
		
		System.out.println(a2);
        int a3 =0xf;
		
		System.out.println(a3);
		System.out.println(Integer.toBinaryString(a));  //转成二进制
		System.out.println(Integer.toOctalString(a));  //转成8进制
		System.out.println(Integer.toHexString(a));  //转成16进制
	    int a4 = 10 ;
	    long b2 = 200;
	    byte b3 = 100; //如果数据的大小没有超过byte、short、char的表述范围，则可以自动转型	
	    
		long a6 = 111233456487L; //默认int 改成long 注意L/l 问题
		
	}
	

}
