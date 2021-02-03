package com.Programe.Org;

public class Even_number {
	public static void main(String[] args) {

		int sum = 0;
		int c = 0;

		for (int i = 1; i <= 30; i++) {
			if (i % 2 == 0) {
				System.out.println(i + ",");
				c++;
				sum = sum + i;

			}
		}
		System.out.println("sum value :" + c);
		System.out.println("count value :" + sum);
	}// hai
	// kumaresh
// hai
}
