package ch4;

public class Exercise4_15 {
	public static void main(String[] args) {
		int number = 12321;
		int tmp = number;
		
		int result = 0;
		
		String str = "";
		while(tmp != 0) {
			str = str + (tmp % 10);
			tmp = tmp / 10;
			
		}
		
		int result2 = Integer.parseInt(str);
		
		if(number == result2)
			System.out.println(number + " 는 회문수 ");
		else
			System.out.println(number + " 는 회문수 아님.");
		
	}
}
