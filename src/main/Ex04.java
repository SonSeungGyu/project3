package main;

public class Ex04 {
	public static void main(String[] args) {
		int mathScore = 93;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println(totalScore);
		
		//평균 점수를 정확하게 구하는 방법
		
		//1.int형 변수에 결과 저장, 정수 2로 나누기
		int avgScore1 = totalScore / 2;
		System.out.println(avgScore1);
		
		//2.double형 변수에 결과 저장, 정수 2로 나누기
		double avgScore2 = totalScore / 2;
		System.out.println(avgScore2);

		//3.double형 변수에 결과 저장, 실수 2.0으로 나누기(가장 정확)
		double avgScore3 = totalScore / 2.0;
		System.out.println(avgScore3);
		
	}
}
