package com.te.assignmnents.common;

public class Pattern3 {

	public static void main(String[] args) {
		 for (int i = 0; i <4; i++)
	        {
	            int alphabet = 65;
	            for (int j = i; j >= 0; j--)
	            {
	                System.out.print((char) (alphabet + j) + " ");
	            }
	            System.out.println();
	}
}
}		