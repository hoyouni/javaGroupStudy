package ch4;

public class Exercise4_5 {
	public static void main(String[] args) {
		for(int i = 0; i <= 10; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------");
		
		int k = 0;
		while(k <= 10) {
			int cnt = 0;
			
			while(cnt <= k) { 
				System.out.print("*");
				cnt++;
			}
			System.out.println();
			k++;
		}
		
		
	}
}
