package com.te.assignmnents.common;

public class largestElement {
 
    public static void main(String[] args) {  
        
        int [] arr = {42,14,72,58,89,18};  
          
        int max = arr[0];   
        for (int i = 0; i < arr.length; i++) {   
           if(arr[i] > max)  
               max = arr[i];  
        }  
        System.out.println("Largest element in given array: " + max); 
    }
    
}