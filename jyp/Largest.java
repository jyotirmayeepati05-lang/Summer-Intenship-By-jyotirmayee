package com.jyp;
import java.util.Scanner;

public class Largest {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a, b, c;
		System.out.println("Enter 3 numbers:");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a > b && a > c)
			System.out.println(a + " is Largest");
		else if (b > c)
			System.out.println(b +" is Largest");
		else
			System.out.println(c + " is Largest");
	}

}
