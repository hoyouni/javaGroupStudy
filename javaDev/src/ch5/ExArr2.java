package ch5;

import java.util.Arrays;

public class ExArr2 {
	public static void main(String[] args) {
		int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		int[] counter = new int[4];
		
		for(int i =0; i < answer.length; i++) {
			counter[answer[i] - 1]++;
		}
		System.out.println("counter : " + Arrays.toString(counter) + "\n");
		
		for(int i = 0; i < counter.length; i++) {
			int cnt = counter[i];
			System.out.print(cnt);
			for(int j = 0; j < cnt; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
