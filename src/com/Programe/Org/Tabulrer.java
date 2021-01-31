package com.Programe.Org;

import java.util.Scanner;

public class Tabulrer {
	public static void main(String[] args) {
		Scanner j= new Scanner(System.in);
		System.out.println("which tabular colum");
		int a = j.nextInt();
		System.out.println("tabular colum " + a);
		System.out.println("how many counts");
		int b = j.nextInt();
		System.out.println("counts " + b);
		int c = 0;
		for (int i = 1; i <= b; i++) {
			c = i * a;
			System.out.println(i + "*" + a + "=" + c);

		}

	}
}
