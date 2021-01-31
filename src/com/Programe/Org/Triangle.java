package com.Programe.Org;

public class Triangle {
	public static void main(String[] args) {
		int a = 0;
		for (int i = 5; i >= 0; i--) {
			a = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(a);
				a++;
			}
			System.out.println();
		}
	}

}
