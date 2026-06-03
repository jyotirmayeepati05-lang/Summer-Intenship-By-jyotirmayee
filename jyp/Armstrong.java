package com.jyp;
import java.util.Scanner;

public class Armstrong {
	
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int n, sum = 0, temp, r;

	        System.out.print("Enter number: ");
	        n = sc.nextInt();

	        temp = n;

	        while (n > 0) {
	            r = n % 10;
	            sum = sum + (r * r * r);
	            n = n / 10;
	        }

	        if (temp == sum)
	            System.out.println("Armstrong Number");
	        else
	            System.out.println("Not Armstrong Number");
	    }
	    
	    }
	


