package quiz;

public class Quiz8 {
	public static void main(String[] args) {
		
		int i = 120;
		boolean result = i > 50 && i < 100;
		System.out.println(result);
		
		int i2 = 34;
		boolean result1 = i2 < 10 || i2 > 30;
		System.out.println(result1);
		
		System.out.println(a(80));
		System.out.println(b(15));
		
	}
	
	static boolean a(int i) {
		return i > 50 && i < 100;
	}
	
	static boolean b(int i) {
		return i < 10 || i > 30;
	}
}
