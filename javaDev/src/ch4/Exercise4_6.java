package ch4;

public class Exercise4_6 {
	public static void main(String[] args) {
		// 두 개 주사위 눈의 합 6 경우의 수
		for(int i = 1; i <= 6; i++) {
			int sum = 0;
			for(int j = 1; j <= 6; j++) {
				sum = i + j;
				if(sum == 6) {
					System.out.println(i + " , " + j);
				}
			}
		}
		
		
	}
}
