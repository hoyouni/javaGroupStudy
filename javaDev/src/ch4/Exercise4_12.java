package ch4;

public class Exercise4_12 {
	public static void main(String[] args) {
		// 구구단
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + (i * j));
			}
			System.out.println();
		}
		
	}
}
