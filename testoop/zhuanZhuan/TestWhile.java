package zhuanZhuan;
/*
 * 测试while循环的用法
 */

public class TestWhile {
	public static void main(String[] args) {
		int a = 1; // 循环条件 条件的初始化
		while (a <= 100) { // 条件判断
			System.out.println(a); // 循环体
			a++; // 迭代
		}
		System.out.println("while循环结束");
		// 计算1-100的和
		int b = 1; // b每次循环一次自增1,
		int sum = 0; // 条件的初始化 sum得到的是累加后值
		while (b <= 100) { // 条件判断
			sum = sum + b; // 循环体 累加后的值+b sum +=b;
			b++; // 迭代
		}
		System.out.println("和为" + sum);
		int c = 0;  //先执行后循环
		do {
			System.out.println(c); //c=5
			c++; //c=6
		}while(c<6);//++后的结果6不小于6所以直接输出5
		
		
		
		
		

	}

}
