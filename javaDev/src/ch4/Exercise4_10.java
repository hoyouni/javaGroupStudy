package ch4;

public class Exercise4_10 {
	public static void main(String[] args) {
		// 12345 경우 1 + 2 + 3 + 4 + 5 인 15 출력
		int num = 12345;
		int sum = 0;
		
		while(num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		
		System.out.println("sum : " + sum);
	}
}
