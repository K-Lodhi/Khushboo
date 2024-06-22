package com.khushi;

import java.util.Scanner;

	public class ProductOfTwoDigitNumbers {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();

	        if (n < 0) {
	            System.out.println("Invalid Input");
	            return;
	        }

	        int[] array = new int[n];

	        for (int i = 0; i < n; i++) {
	            array[i] = sc.nextInt();
	            
	            if (array[i] < 0) {
	                System.out.println("Invalid Input");
		                return;
	            }
	        }

	        int product = 1;
	        boolean foundTwoDigit = false;

	        
	        for (int i = 0; i < n; i++) {
	            int num = array[i];
	            
	            if (num >= 10 && num <= 99) {
	                product *= num;
	                foundTwoDigit = true;
	            }
	        }

	        if (!foundTwoDigit) {
	            System.out.println(1);
	        } else {
	            System.out.println(product);
	        }

	        sc.close();
	    }
	
	}


