package Game;

import java.awt.*;
import javax.swing.*;

public class BallGame2 extends JFrame {

	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");   //����ͼƬ
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");

	double x = 100; // С��ĺ�����
	double y = 100; // С���������
	double degree = 3.14 / 3; // ���� �˴�����60��
	
	// �����ڵķ���
	public void paint(Graphics g) {
		System.out.println("���ڱ�����һ��!");
		g.drawImage(desk, 0, 0, null); // �Ȼ������ٻ���
		g.drawImage(ball, (int) x, (int) y, null); // null �ն���
        //�Ƕ�
		x = x + 10 * Math.cos(degree);
		y = y + 10 * Math.sin(degree);
		// ����������4���߿������Ƕȵı仯
		// ������˵ײ��Ͷ����͸ı�Ƕ�
		// �������±߽�
		if (y > 500 - 40 - 30 || y < 40 + 40) {// 500���ڵĿ��,40�����ӵı߿�,30�����ֱ��,���һ��40�Ǳ������ĸ߶�
			degree = -degree; // ��x��ԳƱ仯
		}
		// �������ұ߽�
		if (x < 40 || x > 856 - 40 - 30) {
			degree = 3.14 - degree; // ����ԳƱ仯
		}

	}

	// ���ڼ���
	void launchFrame() {
		setSize(856, 500);
		setLocation(50, 50);
		setVisible(true); // �ô��ڿɼ�

		while (true) {
			repaint();
			try {
				Thread.sleep(40);// 40ms 1��=1000���� ��Լһ�뻭20�δ���
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	// main �����ǳ���ִ�е����
	public static void main(String[] args) {
		System.out.println("--------------------");
		BallGame2 game = new BallGame2();
		game.launchFrame();

	}

}
