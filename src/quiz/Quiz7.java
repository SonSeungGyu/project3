package quiz;

public class Quiz7 {
	public static void main(String[] args) {
		boolean result1 = (1 == 2) || (1 < 3); //true
		boolean result2 = true && false; //false
		boolean result3 = !false; //true
		
		int x = 1;
		int y = 5;
		boolean result4 = (x < y) || (x == y); //true
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		for (int i = 0; i < 5 ; i++) {
			
		}
		
	}
}
/*
 * 논리합(||)은 두 값 중 하나라도 참이면 참을 반환한다.
 * 논리곱(&&)은 두 값 중 하나라도 거짓이면 거짓을 반환한다.
 * 논리부정(!)은 논리값을 반대로 바꿔준다고 생각하자. 
*/
