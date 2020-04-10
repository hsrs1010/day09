package com.ja.two;

public class NumException {
	public static void main(String[] args) {
		String[] stringNumner= {"23", "12","3.141592","998"};
		
		int i=0;
		try {
			for (i = 0; i < stringNumner.length; i++) {
				int j=Integer.parseInt(stringNumner[i]);
				System.out.println("정수로 변환된 값은" + j);
				
			}
		}
	catch (NumberFormatException e) {
		System.out.println
		(stringNumner[i] + "는 정수로 변환 할 수 없습니다.");
	}
	}
}
