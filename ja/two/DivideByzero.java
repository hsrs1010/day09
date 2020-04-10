package com.ja.two;

import java.util.Scanner;

public class DivideByzero {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int dividend;
		int divisor;
		
		System.out.println("나뉨수 입력");
		dividend=sc.nextInt();
		System.out.println("나눗수 입력");
		divisor=sc.nextInt();
		
		try {
			System.out.println
			(dividend +"를"+divisor+"로 나누면"+(dividend/divisor));
		} catch (Exception e) {
			e.printStackTrace();
		System.out.println("0으로 나누었군요!!");
		}
		
	}
}
