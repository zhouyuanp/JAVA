package cn.zhuan.Collection;

/**
 * 模拟实现JDK中提供ArrayList类
 * 
 * @author Administrator
 *
 */

public class MyArrayList {
	private Object[] value;
	private int size;

	// 建一个构造器/或者构造方法 //初始化一个容器,并把东西放到容器中

	public MyArrayList() {
		// value = new Object[16];
		this(10);
	}

	public MyArrayList(int size) {
		if (size < 0) {
			try {
				throw new Exception(); // 手动抛出异常,以后章节再说
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		value = new Object[size];
	}

	// 方便外部调用
	public int size() {
		return size;

	}

	// 容器为空
	public boolean isEmpty() {
		return size == 0;
	}

	// 添加数据 往容器中放数据
	public void add(Object obj) {
		value[size] = obj;
		size++;
		if (size >= value.length) {
			// 装不下,扩容
			int newCapacity = value.length * 2;
			Object[] newList = new Object[newCapacity];
			// System.arraycopy(src, srcPos, dest, destPos, length);
			// 新容器把老数据考进来 用循环
			for (int i = 0; i < value.length; i++) {
				newList[i] = value[i];
			}
			value = newList;
		}

	}

	// 取数据 用索引
	public Object get(int index) {
		rangeCheck(index);
		return value[index];
	}

	public int indexOf(Object obj) { // 目标对象
		if (obj == null) {
			return -1; // 等于空返回-1
		} else {
			for (int i = value.length - 1; i >= 0; i--) {
				if (obj == value[i]) {
					return i;
				}

			}
			return -1;
		}

	}

	public Object set(int index, Object object) {
		rangeCheck(index);
		Object old = value[index];
		value[index] = object;
		return old;

	}

	public void rangeCheck(int index) {
		if (index < 0 || index > size - 1) { // 数据在[0,size-1]
			try {
				throw new Exception(); // 手动抛出异常,以后章节再说
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList(2);

		list.add("aaaa");
		list.add(new Human("周元鹏"));
		list.add("ssss");
		list.add("ssss");
		list.add("ssss");
		list.add("ssss");

		Human h = (Human) list.get(1);
		System.out.println(h.getName());
		System.out.println(list.get(2));
		System.out.println(list.size);
	}

}
