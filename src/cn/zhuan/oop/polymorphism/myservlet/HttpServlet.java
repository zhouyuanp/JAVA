package cn.zhuan.oop.polymorphism.myservlet;

public class HttpServlet {
	public void service() {
		doGet();
		System.out.println("HttpServlet.service()");

	}

	public void doGet() {
		System.out.println("HttpServlet.doGet()");

	}
}
