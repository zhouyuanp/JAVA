package cn.zhuan.oop.encapsulation01;

public class Man {
	private String name;  //私有的
	private String id;
	private boolean man;//是不是一个男人
	public boolean isMan() {
		return man;
	}
	public void setMan(boolean man) {
		this.man = man;
	}
	public static int cc;
	public static final int MAX_SPEED = 120;  //公开的
	//get方法
	public String getName() { //get后加属性名称
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public static int getCc() {
		return cc;
	}
	public static void setCc(int cc) {
		Man.cc = cc;
	}
	public static int getMaxSpeed() {
		return MAX_SPEED;
	}
 
}
