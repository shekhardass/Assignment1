package com.te.assignmnents.common;

public class SmallestElement {
	 public static void main(String[] args) {  
	        
	        int [] arr = {21,34,62,18,89,93};  
	          
	        int min = arr[0];   
	        for (int i = 0; i < arr.length; i++) {   
	           if(arr[i] < min )  
	               min = arr[i];  
	        }  
	        System.out.println("smallest element in array: " + min); 
	    }

}
