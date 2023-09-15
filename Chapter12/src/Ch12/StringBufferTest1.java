package Ch12;

public class StringBufferTest1 {
	public static void main(String args[]) {
		StringBuffer sb1 = new StringBuffer("Hello JAVA");
		StringBuffer sb2 = new StringBuffer("ó�� �����ϴ� �ڹ�");
		
		System.out.println("���ڿ� => " + sb1);	// Hello JAVA
		System.out.println("���ڿ� ���� => " + sb1.length());	// 10
		System.out.println("���۸� ������ ���� => " + sb1.capacity());	// 26
	    System.out.println("���ۿ� ����ִ� ���� => " + sb2);	// ó�� �����ϴ� �ڹ�
	    System.out.println("���ڿ� �����ֱ� => " + sb2.insert(8,"Power "));	// ó�� �����ϴ� Power �ڹ�
	    System.out.println("������ 8��° ���� => " + sb2.charAt(8));	// P
	    
	    sb2.setCharAt(5, '��');
	    System.out.println("5��° ���� '��'�� ���� => " + sb2);	// ó�� ���۵Ǵ� Power �ڹ�
	    
	    sb2.setLength(5);
	    System.out.println("������ ���ο� �� => " + sb2);	// ó�� ����
	    System.out.println("���ڿ��� ��������ϱ� => " + sb2.reverse());	// �۽� ��ó
	}
}