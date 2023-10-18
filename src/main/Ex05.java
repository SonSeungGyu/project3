package main;

public class Ex05 {
	public static void main(String[] args) {
		
		int x = 5;
		int y = 10;
		
		boolean result1 = (x > y);
		System.out.println("x가 y보다 큰가 " + result1);
		boolean result2 = (x >= y);
		System.out.println("x가 y보다 크거나 같나 "+ result2);
		boolean result3 = (x < y);
		System.out.println("x가 y보다 작은가 "+ result3);
		boolean result4 = (x <= y);
		System.out.println("x가 y보다 작거나 같은가 "+ result4);
		boolean result5 = (x == y);
		System.out.println("x와 y의 값이 같은가 "+ result5);
		boolean result6 = (x != y);
		System.out.println("x와 y의 값이 다른가 "+ result6);
		
		if(x==y) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
			//왜 안 돼
		}
	}
}
