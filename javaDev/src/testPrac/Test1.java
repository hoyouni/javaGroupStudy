package testPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
	
	static String getNumber(int num) {
		return num % 2 == 0 ? "짝수" : "홀수";
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 : ");
		int num = Integer.parseInt(reader.readLine());
		
		// 1번 방법
		System.out.printf("입력하신 숫자 '%d'는 '%s'입니다.\n", num, getNumber(num));
		 
		/* 2번 방법 
		String result = getNumber(num);
		System.out.printf("입력하신 숫자 '%d'는 '%s'입니다.\n", num, result);
		*/
	}
}

















