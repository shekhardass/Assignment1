package com.te.assignmnents.common;

public class secondLargest {

	public static void main(String[] args) {
        int [] arr = {21,4,23,17,38,11,7,9};  
        int temp;
        for(int i=0;i<arr.length;i++) {
        	for(int j=i+1;j<arr.length;j++) {
        		if (arr[i]<arr[j]) {
        			temp=arr[i];
        			arr[i]=arr[j];
        			arr[j]=temp;
        		}
        	}
        	
        }
        System.out.print("2nd largest elements is :" + arr[1]);
	}

}
