package com.te.assignmnents.common;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {

		System.out.println("Enter a year");
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println(year + "is a leap year");
		} else {
			System.out.println(year + "is not a leap year");
		}

	}
}
