package ch5;

import java.util.Arrays;

public class ArrayEx4 {
	public static void main(String[] args) {
		int[] number = new int[10];
		int[] counter = new int[10];
		
		for(int i = 0; i < number.length; i++) {
			number[i] = (int)(Math.random() * 10);
			System.out.print(number[i] + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < number.length; i++) {
			counter[number[i]]++;
			System.out.println(Arrays.toString(counter));
		}
		
		for(int i = 0; i < number.length; i++) {
			System.out.println(i + " 의 개수 : " + counter[i]);
		}
		
	}
}
