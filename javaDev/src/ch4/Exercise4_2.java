package ch4;

public class Exercise4_2 {
	public static void main(String[] args) {
		// 1부터 20 까지 정수 중 2 또는 3의 배수가 아닌 수의 총합을 구하시오
		int sum = 0;
		for(int i = 1; i <= 20; i++) {
			if(i % 2 != 0 && i % 3 != 0)
				sum = sum + i;
		}
		System.out.println(sum);
	}
}
