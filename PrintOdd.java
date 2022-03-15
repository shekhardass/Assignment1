package com.te.assignmnents.common;

import java.util.Scanner;

public class PrintOdd {

	public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
    System.out.println("Enter the number");
    int number=scanner.nextInt();
    System.out.println("odd numbers are");
    for(int i=1;i<=number;i++) {
    	if(i%2==0) {
    		continue;
    	}
    
    	System.out.println(i);
	}
	}

}
