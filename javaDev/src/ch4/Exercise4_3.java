package ch4;

public class Exercise4_3 {
	public static void main(String[] args) {
		// 1 + (1 + 2) + (1 + 2 + 3) + .. + (1 + .. + 10)
		// 1 + 3 + 6 + 10 + .. + 55
		int first = 1;
		int second = 3;
		int minus = second - first;
		int sum = first + second;
		
		for(int i = 3; i <= 10; i++) {
			int third = second + (minus + 1);
			sum = sum + third;
			second = third;
			minus++;
		}
			
		System.out.println(sum);
		
		
	}
}
