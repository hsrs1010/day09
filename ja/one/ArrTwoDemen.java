package com.ja.one;

public class ArrTwoDemen {
	public static void main(String[] args) {
		int arr[][] = new int[2][5];

		System.out.println("ù°�� ��°�� �� : " + arr[0][1]);
		arr[0][1] = 200;
		System.out.println("ù°�� ��°�� �� : " + arr[0][1]);
		arr[0][4] = 5000;
		arr[1][2] = 3000;
		System.out.println("0,4ĭ �� : " + arr[0][4]);
		System.out.println("1,2ĭ �� : " + arr[1][2]);
	}
}