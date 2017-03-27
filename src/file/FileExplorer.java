package file;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FileExplorer extends JFrame {
	JPanel panel;
	JButton bt;
	JLabel la;
	ImageIcon icon;
	File file = new File("c:/");

	public FileExplorer() {
		panel = new JPanel();
		la = new JLabel("디렉토리이름");
		icon = new ImageIcon("C:/java_workspace2/Project0327/res/folder_off.png");
		bt = new JButton(icon);

		bt.setBorderPainted(false);
		bt.setContentAreaFilled(false);
		bt.setFocusPainted(false);
		bt.setOpaque(false);

		panel.setLayout(new BorderLayout());

		panel.add(la, BorderLayout.NORTH);
		panel.add(bt, BorderLayout.CENTER);

		add(panel);

		setLayout(new FlowLayout());

		bt.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				open();
			}
		});

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 600);
		setVisible(true);

	}

	public void open() {
		icon = new ImageIcon("C:/java_workspace2/Project0327/res/folder_on.png");
	}

	public static void main(String[] args) {
		new FileExplorer();
	}

}
