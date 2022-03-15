package com.te.assignmnents.common;

public class DuplicateElements {

	public static void main(String[] args) {
		 
		        int [] arr ={1,2,4,3,7,8,2,3,7,9,9};   
		        System.out.println("Duplicate elements in given array");
		        
		        for (int j=0;j< arr.length;j++) {
		        	int count=0;
		        
		       
				for (int i = 0; i < arr.length; i++) {   
		        	
		        	
		           if(arr[i] == arr[j]) { 
		        	   count++;
		        	   arr[i]='\n';
		           } 
		        } 
		           if (arr[j]!='\n' &&  count>0){
		        	   System.out.println(arr[j]);
		           }
		           
		          }
		        
		      }
		           
		 }

	