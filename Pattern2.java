package com.te.assignmnents.common;

public class Pattern2 {

	public static void main(String[] args) {
		for (int i=1;i<=4;i++) {
			for(int j=4;j>=1;j--)
			{
				if (j>i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(" *");
				}
			}
			System.out.println();
	}
  }
}