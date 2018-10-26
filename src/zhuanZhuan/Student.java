package zhuanZhuan;

public class Student {
	// ��̬������ ����
	String name;
	int id;
	int age;
	String gender; // �Ա�
	int weight; // ����
	Computer computer; //��ʾһ̨���Զ�ʱ����������
	// ��̬����Ϊ ����

	public void study() {
		System.out.println(name + "��ѧϰ");
	}

	public void sayhello(String sname) {
		System.out.println(name + "��" + sname + "˵ : ��� !");
	}

}
