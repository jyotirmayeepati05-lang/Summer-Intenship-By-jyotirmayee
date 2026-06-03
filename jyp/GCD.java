package com.jyp;

public class GCD {
	 public static void main(String[] args) {
	        int a = 12, b = 2;

	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }

	        System.out.println("GCD = " + a);
	    }
	}


