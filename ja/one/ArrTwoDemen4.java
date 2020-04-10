package com.ja.one;

public class ArrTwoDemen4 {
	public static void main(String[] args) {
		
		int arr[][]=new int[4][];
		arr[0]=new int[1];
		arr[1]=new int[2];
		arr[2]=new int[3];
		arr[3]=new int[4];
		//길이 출력
		System.out.println("1번째 행 길이 : " + arr[1].length);
		System.out.println("3번째 행 길이 : " + arr[3].length);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+"행 길이 : "+ arr[i].length);
		}
		
	}
}