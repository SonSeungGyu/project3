package quiz;

public class Quiz4 {
	public static void main(String[] args) {
		int mathScore = 90;
		int engScore = 70;
		int korScore = 100;
		
		int sum = mathScore + engScore + korScore;
		double avg = sum / 3.0;
		
		System.out.println(sum);
		System.out.println(avg);
		
		int re = sum(mathScore,engScore,korScore);
		
		
		System.out.println(re);
	}
	
	public static int sum(int mathScore, int engScore, int korScore) {
		
		return mathScore + engScore + korScore;
	}
	
	public static double avg(int re) {
		return re / 3.0;
	}
		
		
		
}
