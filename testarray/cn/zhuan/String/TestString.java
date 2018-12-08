package cn.zhuan.String;

/**
 * String 称为不可变字符序列.
 * 
 * @author Administrator
 *
 */

public class TestString {
	public static void main(String[] args) {
		String s = "213412";

		String str = new String("abcd");

		System.out.println(str.charAt(2));
		// 1. 比较组数对象是否相等 equals 对比数组的内容是否相等
		String str1 = new String("abcde");
		String str2 = str1;
		System.out.println(str2.equals(str1));
		// 2. 比较组数对象是否相等 equals 对比数组的内容是否相等
		String str3 = new String("abcde");
		String str4 = new String("abcde");
		System.out.println(str4.equals(str3));
		// 3.比较组数对象是否相等 equals 对比数组的内容是否相等
		String str5 = "def";
		String str6 = "def";
		System.out.println(str5.equals(str6));
		System.out.println(str5 == str6);
		// 测试 substring
		String s1 = str5.substring(0);
		System.out.println(s1);

		// 测试 replace //替换数组的元素会创建一个新的字符串
		String str7 = str5.replace("e", "*");
		System.out.println(str7);

		// 数组切割
		String str8 = "sdfa,zxcv,qwer";
		String[] strArray = str8.split(",");
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
		}

		// 测试trim 去除首尾空格,中间空格不去
		String str9 = "  aa  cc  cc  ";
		String str10 = str9.trim();
		System.out.println(str10.length());

		// 测试equalsIgnoreCase 对比字符串是否相等并忽略大小写

		System.out.println("ABc".equalsIgnoreCase("abc"));

		// 测试 lastIndexOf 和indexOf的区别 indexOf是从左往右找 从右边往左边找 lastIndexOf

		System.out.println("abcdefb".indexOf('b'));
		System.out.println("abcdefb".lastIndexOf('b')); // 最后一个b的下标6

		// 测试 startsWith 是不是以什么开头 endsWith 是不是以什么结尾 是true 否 false

		System.out.println("abcdefb".startsWith("ab"));

		// 测试toLowerCase 把字符转成小写和 toUpperCase 把字符转成大写

		System.out.println("ASDFG".toLowerCase());
		System.out.println("asdfqwer".toUpperCase());

		System.out.println("------------------------------------");
		String gh = "a";
		for (int i = 0; i < 10; i++) { // 拼字符串代码 比较浪费空间
			gh = gh + i;

		}
		System.out.println(gh);
		String gh1 = new String("a");
		for (int i = 0; i < 10; i++) { // 拼字符串代码 比较浪费空间
			gh1 = gh1 + i;

		}
		System.out.println(gh);

		System.out.println("-----------------------------------");
		// 获取字符串长度
		String str00 = new String("478bhjd56");
		int strlength = str00.length();
		System.out.println(strlength);
		System.out.println("-----------------------------------");
		String s01 = String.valueOf(12.99);
		System.out.println(s01);
		System.out.println("-----------------------------------");
		char ch = str00.charAt(4);
		System.out.println(ch);
		
		char[] value = {'a','b','c','d','e'};
		String str01 = new String(value);
		
		String str02 = new String(value,1,2);
		System.out.println(str02);
        System.out.println(str01);		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
