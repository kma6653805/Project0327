package file;

import java.awt.FlowLayout;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JFrame;

public class FileWindow extends JFrame {
	MyIcon folder_on, folder_off;

	public FileWindow() {
		setLayout(new FlowLayout());

		// �̹��� �������� �����ϵ�, ���ҽ� �����κ���...
		// Uniformed Resource Locator ;

		folder_on = new MyIcon(this.getClass().getResource("/folder_on.png"), 50, 50);
		folder_off = new MyIcon(this.getClass().getResource("/folder_off.png"), 50, 50);

		// ����� ������ �׽�Ʈ
		ArrayList<String> list = getDirList();

		for (int i = 0; i < list.size(); i++) {
			String dirName = list.get(i);
			MyPanel mp = new MyPanel(dirName, folder_off);
			add(mp);
		}

		setSize(600, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	// ���ϴ� ����� ���� ���丮 �� ���� ���ϱ�
	public ArrayList getDirList() {
		File file = new File("c:/");

		File[] fileList = file.listFiles();
		ArrayList<String> dirList = new ArrayList<String>();

		// ���丮�� �����!!
		for (int i = 0; i < fileList.length; i++) {
			if (fileList[i].isDirectory()) {
				// ���丮�� �߰ߵɶ����� ����Ʈ�� �߰�
				dirList.add(fileList[i].getName());
			}
		}
		return dirList;
	}

	public static void main(String[] args) {
		new FileWindow();

	}

}
