package quiz;

public class Quiz6 {
	public static void main(String[] args) {
		int num = 7;
		int num1 = 10;
		
		boolean result = num % 2 != 0;
		boolean result1 = num1 % 2 == 0;
		
		System.out.println(result);
		System.out.println(result1);
		
		System.out.println(isOdd(7));
		System.out.println(isEven(10));
		
	}
	
	static boolean isOdd(int num) {
		return num % 2 != 0;
	}
	
	static boolean isEven(int num) {
		return num % 2 == 0;
		}
		
	
}
