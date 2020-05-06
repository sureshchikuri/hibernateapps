package com.vcs.test;

public class Test {

	public static void main(String[] args) {

		int p = 0;
		int d = 0;
		String[] days = { "sun", "mon", "tue", "wed", "thu", "fri", "sat" };

		for (int i = 1; i < 6; i++) {

			for (int j = 0; j < days.length; j++) {
				System.out.println(days[j]);
				p++;
				System.out.println(p);
			}
		}

	}
}
