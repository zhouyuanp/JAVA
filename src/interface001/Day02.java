package interface001;

public interface Day02 {

	public static void main(String[] args) {
		
	int res=add2(9,5);	
	System.out.println(res);	
	//无参无返	
	}
	public static void add(){
		int a=3;
		int b=4;
		int c=a+b;
	System.out.println(c);
	
	}
	//有参无返
	public static void add1(int a,int b){
		int c=a+b;
		System.out.println(c);	
	
	
  }
	//有参有返
	public static int add2(int a,int b){
		int c=a+b;
		return c;
	
}
	//无参有返
	public static int add3(){
		int a=8;
		int b=2;
		int c=a+b;
		return c;
	}
	
	
}


////调用在不在不同的包中调用
//package day02;
//
//import day01.Snippet;
//
//public class TestSnippet {
//
//public static void main(String[] args) {
//	Snippet sn=new Snippet();
//	sn.ad
//
//}




