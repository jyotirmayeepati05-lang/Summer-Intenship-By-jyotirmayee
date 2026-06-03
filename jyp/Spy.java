package com.jyp;

public class Spy {
	public static void main(String[] args) {
		int n = 19;
		int sum = 0, product = 1;
		
		while (n> 0) {
			int rem = n%10;
			sum += rem;
			product += rem;
			n /= 10;
		}
		if ( sum== product)
			System.out.println("Spy Number");
		else
			System.out. println("Not Spy Number");
		
	}

}
