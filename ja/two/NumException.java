package com.ja.two;

public class NumException {
	public static void main(String[] args) {
		String[] stringNumner= {"23", "12","3.141592","998"};
		
		int i=0;
		try {
			for (i = 0; i < stringNumner.length; i++) {
				int j=Integer.parseInt(stringNumner[i]);
				System.out.println("������ ��ȯ�� ����" + j);
				
			}
		}
	catch (NumberFormatException e) {
		System.out.println
		(stringNumner[i] + "�� ������ ��ȯ �� �� �����ϴ�.");
	}
	}
}
