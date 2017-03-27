//�г��� �󺧰� ��ư�� ������ �ִ�.
//JPanel has a Label & Jbutton
package file;

import java.awt.BorderLayout;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	JLabel la;
	JButton bt;

	// �г��� �¾��, �� ��ǰ�� ���� �¾�� �ϹǷ�, �����ڿ��� �ʱ�ȭ ����!
	public MyPanel(String title, Icon icon) {
		la = new JLabel(title);
		bt = new JButton(icon);

		bt.setBorderPainted(false); // ��ư�� ��輱 ���ֱ�!
		bt.setContentAreaFilled(false); // �� ä��� ����
		bt.setFocusPainted(false); // ��Ŀ���� ���� ��� ���ֱ�
		bt.setOpaque(false); //����

		this.setLayout(new BorderLayout());
		add(la, BorderLayout.NORTH);
		add(bt); // ���Ϳ�..

	}
}