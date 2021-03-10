package ch4;

import java.util.Scanner;

public class Exercise4_14 {
	public static void main(String[] args) {
		int answer =(int)(Math.random() * 100 + 1);
		int input = 0;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1 과 100 사이의 값 입력 : ");
			input = sc.nextInt();
			
			if(input == answer) {
				System.out.println("맞췄습니다. ");
				System.out.println("시도횟수는 " + count + "번 입니다.");
				return;
			} else if(input < answer) {
				System.out.println("더 큰 수를 입력하시오.");
			} else {
				System.out.println("더 작은 수를 입력하시오.");
			}
				
			
		} while(true);
		
	}
}
