package interface001;

import java.util.Arrays;

public class MaoPao {
	public static void main(String[] args) {

		int[] a = { 12, 18, 9, 8, 19, 25, 16, 13, 14, 10 };
		add(a);
	}

	public static void add(int[] a) {

		for (int i = 0; i < a.length - 1; i++) { // �����ⲿѭ��������������ѭ��ѭ������
			// System.out.print(a[i]); ����ѭ���Ĵ����ⲿѭ���Ĵ���
			for (int j = 0; j < a.length - 1 - i; j++) {// �����ڲ�ѭ�������峤�ȼ�ѭ���ĳ��ȿ��ƺ��һ������
				// a[j]Ԫ�صĺ�һλjһ��ʼ��0��a[j+1]Ԫ��i�ĺ�һλ18 ����ǰһ�����ͺ�һ�����ıȽ�
				if (a[j] > a[j + 1]) {
					int c = a[j];// Ԫ��
					a[j] = a[j + 1];
					a[j + 1] = c;
				}
				// System.out.println(Arrays.toString(a)+"����");
			}
			// System.out.println(Arrays.toString(a)+"����");
		}
		System.out.println(Arrays.toString(a));
	}

} // System.out.println();
