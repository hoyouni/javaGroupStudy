package ch3;

public class OperatorEx13 {
	public static void main(String[] args) {
		char c1 = 'a'; //97
		char c2 = c1;
		char c3 = ' ';
		int i = c1 + 1;
		
		c3 = (char)(c1 + 1);
		c2++;
		c2++;
		
		System.out.println("i = " + i);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
		
		int numA = 123;
		int numB = 10;
		double numC = Math.ceil((double)(numA) / (double)(numB));
		int result = (int) numC; 
		System.out.println(result);
		
		int numD = 10;
		System.out.println(numD == 0 ? 0 : (numD > 0 ? "양수" : "음수"));
		
	}
	
}




























