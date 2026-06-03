package com.jyp;

public class StrongNumber {
	
	    public static void main(String[] args) {
	        int n = 954, temp = n, sum = 0;

	        while (n > 0) {
	            int rem = n % 10;
	            int fact = 1;

	            for (int i = 1; i <= rem; i++) {
	                fact *= i;
	            }

	            sum += fact;
	            n /= 10;
	        }

	        if (sum == temp)
	            System.out.println("Strong Number");
	        else
	            System.out.println("Not Strong Number");
	    }
	}


