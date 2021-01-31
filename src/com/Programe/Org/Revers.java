package com.Programe.Org;

public class Revers {
	public static void main(String[] args) {
		String s = "well come to java";

		String[] all = s.split(" ");
		String b = "";
		for (String word : all) {
			String a = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				a = a + word.charAt(i);

			}
			b = b + a + " ";
		}
		System.out.println(b);

	}
}
