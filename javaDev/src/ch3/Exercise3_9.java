package ch3;

public class Exercise3_9 {
	public static void main(String[] args) {
		char ch = 'z';
		
		boolean b = 
				((Character.toUpperCase(ch) >= 65) && Character.toUpperCase(ch) <= 90) 
				|| ((ch >= 48) && (ch <= 57)) ? true : false;


		// 48 ~ 57
		
		
		
		System.out.println(b);
		
	}
}

























