/*
 * ���̸� �Է¹޾� ����Ͻÿ�.
 * �Է¹��� ���̰� ������ �ƴ� ��� ����ó�� �Ͻÿ�.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest7 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		
		try {
			int age = stdIn.nextInt();
			System.out.println("����� ���̴� " + age + "�Դϴ�.");
		} catch (InputMismatchException e) {
			//e.printStackTrace();
			System.out.print("���̴� ������ �Է��ϼ���.");
		}				
	}
}