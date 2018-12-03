package zhuanZhuan;

public class test1 {
	public static void main(String[] args) { // java�������main����ִ�д��밡 studen��main�������߼���û��ϵ
		// �Ӵ���Ƕ�main������student���� //ͨ�������������Student��,���غ�,�ڷ������о�����Studend����Ϣ

		Student s1 = new Student();// ��ʼ��һ������s1 s1 ������StudendΪģ��
		s1.name = "��Ԫ��";
		s1.study();
		s1.sayhello("�޹���");
		Student s2 = new Student();
		s2.name = "�ϸ�";
		s2.age = 18;

	}
}
