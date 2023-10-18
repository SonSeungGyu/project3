package main;

public class Ex01 {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = -20;
		
		//+ 부호는 부호를 유지한다
		System.out.println(+num1);
		System.out.println(+num2);
		
		//- 부호는 부호를 반대로 바꾼다
		System.out.println(-num1);
		System.out.println(-num2);
		
		//부호연산자는 값 자체를 바꾸지 않는다. 값을 카피해서 사용한다.
		System.out.println(num1);
		System.out.println(num2);
		
	}
}
