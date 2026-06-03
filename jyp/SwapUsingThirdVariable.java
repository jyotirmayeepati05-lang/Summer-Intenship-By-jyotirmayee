package com.jyp;

public class SwapUsingThirdVariable {
	public static void main(String[] args) {

        int a = 50;
        int b = 30;

        System.out.println("Before Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter Swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
