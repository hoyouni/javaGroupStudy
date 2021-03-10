package ch4;

public class Exercise4_8 {
	public static void main(String[] args) {
		// 방정식 2x + 4y = 10의 모든해
		
		int first = 2;
		int second = 4;
		int result = 10;
		for(int x = 0; x <= 10; x++) {
			for(int y = 0; y <= 10; y++) {
				if((first * x) + (second * y) == result) {
					System.out.println("x : " + x + " y : " + y);
				}
			}
		}
		
	}
}
