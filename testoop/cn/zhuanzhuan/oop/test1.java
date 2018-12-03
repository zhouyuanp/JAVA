package cn.zhuanzhuan.oop;

public class test1 {
	public static void main(String[] args) { 
		// java虚拟机找main方法执行代码啊 studen与main方法在逻辑上没关系
		// 从代码角度main方法在student类中 //通过类加载器加载Student类,加载后,在方法区中就有了Studend的信息
		// 初始化一个对象s1 s1 对象以Studend为模板
	
	
		Student s1 = new Student();
		s1.name = "周元鹏";
		s1.study();
		s1.sayhello("娃哈哈");
		Student s2 = new Student();
		s2.name = "老高";
		s2.age = 18;

	}
}
