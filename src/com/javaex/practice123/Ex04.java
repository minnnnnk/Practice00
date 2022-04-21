package com.javaex.practice123;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] argss) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int count=0;
		int sum = 0;
		
		
		
		for (int i= 1; i<=num; i++) {
			
			if(i%5==0) {
				count++;
				sum=sum+i;
			}
			
		}
			
		System.out.println("5의배수의 개수: "+count);
		System.out.println("5의배수의 합: "+sum);
		
		sc.close();
	}
}
