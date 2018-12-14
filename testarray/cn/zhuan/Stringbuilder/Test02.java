package cn.zhuan.Stringbuilder;
/**
 * 测试StringBuilder的一些常用方法
 * 
 * 
 * 
 */
public class Test02 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcdefghijklimnopqrstuvwxyz");
		//测试 delete 方法 删除数组内容
		sb.delete(3, 6);   //delete 方法是包头不包尾 第6个数不删除
		sb.delete(3, 5).delete(3, 5); //可以写方法链
	    System.out.println(sb);
	    //测试 reverse 方法  数组翻转
	    sb.reverse();
	    System.out.println(sb);
	    sb.insert(0, 9);
	    System.out.println(sb);
	    
	    
	    StringBuffer sb2 = new StringBuffer("112233445566778899");
	    sb2.insert(0, 9);
	    System.out.println(sb2);
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
	

}
