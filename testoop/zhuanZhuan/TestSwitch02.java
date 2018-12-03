package zhuanZhuan;

public class TestSwitch02 {
	public static void main (String[] args) {
		String a = "马上";
		switch (a){  //jdk
		case "马上":
			System.out.println("输入的是马上");
			break;
		case "高期":
			System.out.println("输入的是高期");
			break;
		default:
			System.out.println("大家好");
			break;
			
			
		}
		
	}

}
