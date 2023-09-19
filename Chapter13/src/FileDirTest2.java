import java.io.File;

public class FileDirTest2 {
	public static void main(String[] args) {
		String dir = "C:/Windows1";
		File f1 = new File(dir);  // ���� ��ü ����.
		
		try {    // if(f1.isDirectory())
			System.out.println("�˻� ���丮 : " + dir);
			System.out.println("===================");
			
			// ���丮�� ��� ��Ҹ� ���ڿ��� �迭�� ����.
			String s[] = f1.list();
			
			for(int i = 0; i < s.length; i++) {
				// ���ڿ��� �׸����� ��ü ����.
				File f = new File(dir + "/" + s[i]);
				if(f.isDirectory()) {
					System.out.println(s[i] + " : ���丮");
				}
				else {
					System.out.println(s[i] + " : ����");
				}
			}
		}
		catch (Exception e) {   // else
			System.out.println("������ " + dir + "�� ���丮�� �ƴմϴ�.");
			System.out.println(e);
		}
	}
}
