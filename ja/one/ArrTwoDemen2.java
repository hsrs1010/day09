package com.ja.one;

public class ArrTwoDemen2 {
	public static void main(String[] args) {
		// int arr[][] = new int[2][5];
		int arr[][]= {
				{0,0,0,0,0},
				{0,0,0,0,1000}
				};
		
		
		System.out.println("첫째행 둘째열 값 : " + arr[0][1]);
		arr[0][1] = 200;
		System.out.println("첫째행 둘째열 값 : " + arr[0][1]);
		arr[0][4] = 5000;
		arr[1][2] = 3000;
		System.out.println("0,4칸 값 : " + arr[0][4]);
		System.out.println("1,2칸 값 : " + arr[1][2]);
		System.out.println(arr[1][4]);
	}
}