package Ch12;

public class IntegerTeat1 {

	public static void main(String[] args) {
		// ���� ���� �μ��� �޾� Integer ��ü�� �����ϴ� ��.
		// Integer num1 = new Integer(13);  // ������, java 9 �������� ������� �ʴ� ���
		Integer num1 = Integer.valueOf(13);  // valueOf() �޼ҵ� ���.
		Integer num2 = 25;   // Autoboxing�� �̿��� ���
		
		System.out.println("num1�� �����ϰ� �ִ� ������ : " + num1.intValue());
		System.out.println("num2�� �����ϰ� �ִ� ������ : " + num2);
		System.out.println("�μ��� ��  = " + num2);
												// Ŭ���� �޼ҵ� ȣ��.
		System.out.println("���� 2�� ǥ�� : " + Integer.toBinaryString(num2));
		System.out.println("���� 8�� ǥ�� : " + Integer.toOctalString(num2));
		System.out.println("���� 16�� ǥ�� : " + Integer.toHexString(num2));   
		System.out.println("if(num1 == num2) �� : " + num1.equals(num2));
		
		Integer num3 = Integer.valueOf("444"); // valueOf �޼��带 �̿��� ��� 
		System.out.println("���ڿ� '444'�� ���� : " + num3.intValue()); 
		System.out.println("2���� '1001001'�� 10�� ���� : " + Integer.parseInt("1001001", 2)); 
	}
}
