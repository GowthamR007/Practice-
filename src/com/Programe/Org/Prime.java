package com.Programe.Org;

public class Prime {
	public static void main(String[] args) {
		for (int i = 1; i <= 30; i++) {
			int a = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					a++;
				}
			}
			if (a == 0) {

				System.out.println(i);

			}
		}
	}
}
