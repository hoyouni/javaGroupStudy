package ch5;

import java.util.Arrays;

public class ExArr2 {
	public static void main(String[] args) {
		int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
		int[] counter = new int[4];
		
		System.out.println(Arrays.toString(counter));
		
		for(int i =0; i < answer.length; i++) {
			counter[answer[i] - 1]++;
			//System.out.println("counter : " + Arrays.toString(counter));
		}
		//System.out.println("counter : " + Arrays.toString(counter) + "\n");
		
		for(int i = 0; i < counter.length; i++) {
			System.out.print(counter[i]);
			for(int j = 0; j < counter[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
