package testPrac;

public class Test2 {
	public static void main(String[] args) {
		int num = 273645281;
		
		for(int i = 1; num == 0; i++) {
			num = num % (int)Math.pow(10, i);
			System.out.println(num);
			num = num / (int)Math.pow(10, i);
		}
		
	}
}













