/*
 * 나이를 입력받아 출력하시오.
 * 입력받은 나이가 정수가 아닌 경우 예외처리 하시오.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest7 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		
		try {
			int age = stdIn.nextInt();
			System.out.println("당신의 나이는 " + age + "입니다.");
		} catch (InputMismatchException e) {
			//e.printStackTrace();
			System.out.print("나이는 정수로 입력하세요.");
		}				
	}
}