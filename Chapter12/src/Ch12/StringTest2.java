package Ch12;

public class StringTest2 {
	public static void main(String args[]) {
		String s1 = "Java Korea"; 
		String s2 = new String("Java Korea"); 
		String s3 = s2.intern(); // 같은 내용의 문자열이 있을 경우 그 문자열의 주소 값 반환.
		
		String s4 = "Java Korea";
		String s5 = new String("Java Korea"); 
		System.out.println("s1과  s2가 같은 장소? : " + (s1 == s2));   // false
		System.out.println("s1과  s2의 값이 같은가? : " + (s1.equals(s2)));  // true
		System.out.println("s1과  s3가 같은 장소? : " + (s1 == s3));   // true
		System.out.println("s2와  s5가 같은 장소? : " + (s2 == s5));   // false
		System.out.println("s2과  s5의 값이 같은가? : " + (s2.equals(s5)));  // true
	}
}