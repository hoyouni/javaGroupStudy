package ch4;

public class Exercise4_9 {
	public static void main(String[] args) {
		// "12345" 경우 1 + 2 + 3 + 4 + 5 인 15 출력
		String str = "12345";
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			sum = sum + (str.charAt(i) - 48);
		}
		System.out.println("sum : " + sum);
	}
}
