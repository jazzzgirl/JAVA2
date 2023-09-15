import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest05 {

	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("a.txt");
			int i;
			while((i = file.read()) != -1) {
				System.out.print((char)i);
			}
			file.close();
		} catch (FileNotFoundException e) {
			System.out.print(e + "������ �������� �ʽ��ϴ�.");
		} catch (IOException e) {
			System.out.print("������ ���� �� �����ϴ�.");
		}
	}
}
