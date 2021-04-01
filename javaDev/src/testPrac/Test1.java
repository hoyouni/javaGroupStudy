package testPrac;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		/* 1번
		String a = "100";
		String b = "200";
		System.out.println(Integer.parseInt(a) + " * " + Integer.parseInt(b) + " = " + (Integer.parseInt(a) * Integer.parseInt(b)));
		*/
		
		/* 2번
		int money = 65430;
		int[] result = new int[10];
		int cnt = 0;
		while(money != 0) {
			int share = money % 10;
			money = money / 10;
			result[cnt] = share;
			cnt++;
		}
		
		for(int i = result.length - 1; i >= 0; i--) {
			if(result[i] != 0) {
				System.out.println(result[i]);
			}
		}
		*/
		
		/* 3번
		int money = 1500000;
		int earnMoney = 55000;
		double other = money * 0.1;
		
		int result = money + earnMoney - (int)other;
		System.out.println(result);
		*/
		
		/* 5번
		Scanner sc = new Scanner(System.in);
		System.out.print("name : ");
		String name = sc.next();
		System.out.print("kor : ");
		int kor = sc.nextInt();
		System.out.print("eng : ");
		int eng = sc.nextInt();
		System.out.print("mat : ");
		int mat = sc.nextInt();
		
		System.out.println("이름 : " + name);
		System.out.println("합계점수 : " + (kor + eng + mat));
		System.out.printf("평균 : %.1f\n" , ((kor + eng + mat) / (float)3));
		*/
		
		/* 6번
		Scanner sc = new Scanner(System.in);
		System.out.print("밑변 : ");
		float first = sc.nextFloat();
		System.out.print("높이 : ");
		float second = sc.nextFloat();
		
		System.out.printf("넓이 : %.2f", (first * second) / 2f);
		*/
		
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Input a : ");
		int a = Integer.parseInt(br.readLine());
		System.out.print("Input b : ");
		int b = Integer.parseInt(br.readLine());
		
		int result = a > b ? a : b;
		
		System.out.println("큰 수 : " + result);
		*/
		
		/* 9번
		Scanner sc = new Scanner(System.in);
		System.out.print("input : ");
		String s1 = sc.next();
		char c1 = s1.charAt(0);
		
		if('a' <= c1 && c1 <= 'z') {
			System.out.println(s1.toUpperCase());
		}
		else if('A' <= c1 && c1 <= 'Z') {
			System.out.println(s1.toLowerCase());
		}
		else {
			System.out.println("입력 데이터 오류");
		}
		*/
		
	}
}

















