package ch4;

public class Exercise4_4 {
	public static void main(String[] args) {
		// 1 + (-2) + 3 + (-4) + .. 몇 까지 더해야 총 합이 100이 넘는가
		
		int sum = 0;
		int cnt = 1;
		while(sum < 100) {
			sum = sum + cnt;
			if(sum >= 100) 
				break;
			else {
				if(cnt > 0)
					cnt++;
				else
					cnt--;
				cnt = -cnt;
			}
			
			System.out.println(sum + " + " + cnt + " = " + (sum + cnt));
		}
		
		System.out.println("result : " + cnt);
		
		
		
	}
}
