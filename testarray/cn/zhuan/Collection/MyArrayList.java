package cn.zhuan.Collection;

/**
 * 模拟实现JDK中提供ArrayList类
 * 
 * @author Administrator
 *
 */

public class MyArrayList {
	Object[] value;
	int size;

	// 建一个构造器/或者构造方法 //初始化一个容器,并把东西放到容器中

	public MyArrayList() {
		value = new Object[16];
	}

	public MyArrayList(int size) {
		value = new Object[size];
	}

	// 添加数据 往容器中放数据
	public void add(Object obj) {
		value[size] = obj;
		size++;

	}

	// 取数据 用索引
	public Object get(int index) {
		if (index < 0 || index > size - 1) { // 数据在[0,size-1]
			try {
				throw new Exception();  //手动抛出异常,以后章节再说
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return value[index];
	}

}
